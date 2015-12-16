/*
 * Copyright 2008-2012 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.beautifulyears.api.endpoint.catalog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.broadleafcommerce.common.exception.ServiceException;
import org.broadleafcommerce.core.catalog.domain.Category;
import org.broadleafcommerce.core.catalog.domain.Product;
import org.broadleafcommerce.core.search.domain.ProductSearchCriteria;
import org.broadleafcommerce.core.search.domain.ProductSearchResult;
import org.broadleafcommerce.core.search.domain.SearchFacetDTO;
import org.broadleafcommerce.core.web.api.BroadleafWebServicesException;
import org.broadleafcommerce.core.web.api.wrapper.CategoriesWrapper;
import org.broadleafcommerce.core.web.api.wrapper.CategoryAttributeWrapper;
import org.broadleafcommerce.core.web.api.wrapper.CategoryWrapper;
import org.broadleafcommerce.core.web.api.wrapper.InventoryWrapper;
import org.broadleafcommerce.core.web.api.wrapper.MediaWrapper;
import org.broadleafcommerce.core.web.api.wrapper.ProductAttributeWrapper;
import org.broadleafcommerce.core.web.api.wrapper.ProductWrapper;
import org.broadleafcommerce.core.web.api.wrapper.RelatedProductWrapper;
import org.broadleafcommerce.core.web.api.wrapper.SearchResultsWrapper;
import org.broadleafcommerce.core.web.api.wrapper.SkuAttributeWrapper;
import org.broadleafcommerce.core.web.api.wrapper.SkuWrapper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * This endpoint provides rest for catalog.
 * 
 * @author Aspire Software Solutions
 *
 */
@Component
@Scope("singleton")
@Path("/catalog/")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class CatalogEndpoint extends
    org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint {

  final static Logger logger = Logger.getLogger(CatalogEndpoint.class);

  /*
   * This method is used to get the product by product id
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findProductById(javax.servlet .http.HttpServletRequest, java.lang.Long)
   */
  @Override
  @GET
  @Path("product/{id}")
  public ProductWrapper findProductById(@Context HttpServletRequest request,
      @PathParam("id") Long id) {
    logger.debug("Executing method : findProductById()");
    return super.findProductById(request, id);
  }

  /*
   * This method is used to get product list based on search query
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findProductsByQuery(javax .servlet.http.HttpServletRequest, java.lang.String,
   * java.lang.Integer, java.lang.Integer)
   */
  @Override
  @GET
  @Path("search/products")
  public SearchResultsWrapper findProductsByQuery(@Context HttpServletRequest request,
      @QueryParam("q") String q, @QueryParam("pageSize") @DefaultValue("15") Integer pageSize,
      @QueryParam("page") @DefaultValue("1") Integer page) {
    logger.debug("Executing method : findProductsByQuery()");
    try {
      if (StringUtils.isNotEmpty(q)) {
        q = StringUtils.trim(q);
        q = exploitProtectionService.cleanString(q);
      } else {
        throw BroadleafWebServicesException.build(Response.Status.BAD_REQUEST.getStatusCode())
            .addMessage(BroadleafWebServicesException.SEARCH_QUERY_EMPTY);
      }
    } catch (ServiceException e) {
      throw BroadleafWebServicesException.build(Response.Status.BAD_REQUEST.getStatusCode())
          .addMessage(BroadleafWebServicesException.SEARCH_QUERY_MALFORMED, q);
    }

    List<SearchFacetDTO> availableFacets = getSearchService().getSearchFacets();
    ProductSearchCriteria searchCriteria =
        facetService.buildSearchCriteria(request, availableFacets);
    searchCriteria.setPageSize(Integer.MAX_VALUE);
    searchCriteria.setPage(1);
    try {
      ProductSearchResult result = null;
      result = getSearchService().findProductsByQuery(q, searchCriteria);
      // Get products
      List<Product> products = result.getProducts();
      if (null != products) {
        Set<Product> activeProductSet = new HashSet<Product>();
        List<Category> categoryList = catalogService.findAllCategories();
        List<Category> categoryActiveList = getAllActiveCategories(categoryList);
        for (Category category : categoryActiveList) {
          List<Product> productList = catalogService.findActiveProductsByCategory(category);
          for (Product product : productList) {
            long id = product.getId();
            for (Product currentProduct : products) {
              if (currentProduct.getId() == id) {
                activeProductSet.add(product);
              }
            }
          }
        }
        
        result.setTotalResults(activeProductSet.size());
        result.setPage(page);
        result.setPageSize(pageSize);
        List<Product> activeProductList = new ArrayList<Product>(activeProductSet);
        // Pagination
        activeProductList = getProductPagination(activeProductList, page, pageSize);

        // set products
        result.setProducts(activeProductList);
        
      }

      facetService.setActiveFacetResults(result.getFacets(), request);

      SearchResultsWrapper wrapper =
          (SearchResultsWrapper) context.getBean(SearchResultsWrapper.class.getName());
      wrapper.wrapDetails(result, request);
      return wrapper;
    } catch (ServiceException e) {
      throw BroadleafWebServicesException.build(
          Response.Status.INTERNAL_SERVER_ERROR.getStatusCode()).addMessage(
          BroadleafWebServicesException.SEARCH_ERROR);

    }
  }

  /**
   * Get List of all active products, excluding products which are in deleted category
   * 
   * @param request
   * @param productLimit
   * @param productOffset
   * @return
   */
  @GET
  @Path("products")
  public List<ProductWrapper> getAllActiveProducts(@Context HttpServletRequest request,
      @QueryParam("productLimit") @DefaultValue("20") int productLimit,
      @QueryParam("productOffset") @DefaultValue("1") int productOffset,
      @QueryParam("pageSize") @DefaultValue("10") Integer pageSize,
      @QueryParam("page") @DefaultValue("1") Integer page) {
    logger.debug("Executing method : getAllActiveProducts()");

    List<Category> categoryList = catalogService.findAllCategories();
    List<Category> categoryActiveList = getAllActiveCategories(categoryList);
    List<ProductWrapper> out = new ArrayList<ProductWrapper>();
    Set<Product> productsSet = new HashSet<Product>();
    for (Category category : categoryActiveList) {
      List<Product> Catproducts = catalogService.findActiveProductsByCategory(category);
      if (Catproducts != null) {
        productsSet.addAll(Catproducts);
      }
    }

    
    List<Product> productsList = new ArrayList<Product>(productsSet);
    productsList = getProductPagination(productsList, page, pageSize);

    for (Product product : productsList) {
      ProductWrapper wrapper = (ProductWrapper) context.getBean(ProductWrapper.class.getName());
      wrapper.wrapSummary(product, request);
      out.add(wrapper);
    }
    return out;
  }
  
  /**
   * Get Count of all active products, excluding products which are in deleted category
   * 
   * @param request
   * @param productLimit
   * @param productOffset
   * @return
   */
  @GET
  @Path("productCount")
  public Integer getAllActiveProductsCount(@Context HttpServletRequest request
      ) {
    logger.debug("Executing method : getAllActiveProductsCount()");

    List<Category> categoryList = catalogService.findAllCategories();
    List<Category> categoryActiveList = getAllActiveCategories(categoryList);
    Set<Product> set = new HashSet<Product>();
    for (Category category : categoryActiveList) {
      List<Product> Catproducts = catalogService.findActiveProductsByCategory(category);
      if (Catproducts != null) {
    	  set.addAll(Catproducts);
      }
    }

    return set.size();
  }

  /**
   * This method is used to get featured product list
   * 
   * @param request
   * @param pageSize
   * @param page
   * @return
   */
  @GET
  @Path("products/featured")
  public List<ProductWrapper> findFeaturedProductsByQuery(@Context HttpServletRequest request,
      @QueryParam("pageSize") @DefaultValue("15") Integer pageSize,
      @QueryParam("page") @DefaultValue("1") Integer page) {
    logger.debug("Executing method : findFeaturedProductsByQuery()");
    List<Category> categoryList = catalogService.findAllCategories();
    List<Category> categoryActiveList = getAllActiveCategories(categoryList);
    List<Product> products = new ArrayList<Product>();
    List<ProductWrapper> out = new ArrayList<ProductWrapper>();
    for (Category category : categoryActiveList) {
      List<Product> Catproducts = catalogService.findActiveProductsByCategory(category);
      for (Product product : Catproducts) {
        if (product.isFeaturedProduct()) {
          products.add(product);
        }
      }
    }

    // Pagination
    products = getProductPagination(products, page, pageSize);
    for (Product product : products) {
      ProductWrapper wrapper = (ProductWrapper) context.getBean(ProductWrapper.class.getName());
      wrapper.wrapSummary(product, request);
      out.add(wrapper);
    }
    return out;
  }

  /*
   * This method is used to get product based on search query from particular category
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findProductsByCategoryAndQuery (javax.servlet.http.HttpServletRequest, java.lang.Long,
   * java.lang.String, java.lang.Integer, java.lang.Integer)
   */
  @Override
  @GET
  @Path("search/category/{categoryId}/products")
  public SearchResultsWrapper findProductsByCategoryAndQuery(@Context HttpServletRequest request,
      @PathParam("categoryId") Long categoryId, @QueryParam("q") String q,
      @QueryParam("pageSize") @DefaultValue("15") Integer pageSize,
      @QueryParam("page") @DefaultValue("1") Integer page) {
    logger.debug("Executing method : findProductsByCategoryAndQuery()");
    try {
      if (StringUtils.isNotEmpty(q)) {
        q = StringUtils.trim(q);
        q = exploitProtectionService.cleanString(q);
      } else {
        throw BroadleafWebServicesException.build(Response.Status.BAD_REQUEST.getStatusCode())
            .addMessage(BroadleafWebServicesException.SEARCH_QUERY_EMPTY);
      }
    } catch (ServiceException e) {
      throw BroadleafWebServicesException.build(Response.Status.BAD_REQUEST.getStatusCode())
          .addMessage(BroadleafWebServicesException.SEARCH_QUERY_MALFORMED, q);
    }

    if (categoryId == null) {
      throw BroadleafWebServicesException.build(Response.Status.BAD_REQUEST.getStatusCode())
          .addMessage(BroadleafWebServicesException.INVALID_CATEGORY_ID, categoryId);
    }

    Category category = null;
    category = catalogService.findCategoryById(categoryId);
    if (category == null) {
      throw BroadleafWebServicesException.build(Response.Status.BAD_REQUEST.getStatusCode())
          .addMessage(BroadleafWebServicesException.INVALID_CATEGORY_ID, categoryId);
    }

    List<SearchFacetDTO> availableFacets = getSearchService().getSearchFacets();
    ProductSearchCriteria searchCriteria =
        facetService.buildSearchCriteria(request, availableFacets);
    searchCriteria.setPageSize(Integer.MAX_VALUE);
    searchCriteria.setPage(1);
    try {
      ProductSearchResult result = null;
      result = getSearchService().findProductsByCategoryAndQuery(category, q, searchCriteria);
      List<Product> products = result.getProducts();
      if (null != products) {
        List<Product> activeProducts = new ArrayList<Product>();
        for (Product product : products) {
          if (product.getDefaultCategory().isActive() && product.isActive()) {
            activeProducts.add(product);
          }
        }

        // Pagination
        activeProducts = getProductPagination(activeProducts, page, pageSize);

        // set products
        result.setProducts(activeProducts);
        result.setTotalResults(activeProducts.size());
        result.setPageSize(pageSize);
        result.setPage(page);
      }
      facetService.setActiveFacetResults(result.getFacets(), request);

      SearchResultsWrapper wrapper =
          (SearchResultsWrapper) context.getBean(SearchResultsWrapper.class.getName());
      wrapper.wrapDetails(result, request);
      return wrapper;
    } catch (ServiceException e) {
      throw BroadleafWebServicesException.build(Response.Status.INTERNAL_SERVER_ERROR
          .getStatusCode());
    }
  }

  /*
   * This method is used to get sku for product based on product id
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findSkusByProductById(javax .servlet.http.HttpServletRequest, java.lang.Long)
   */
  @Override
  @GET
  @Path("product/{id}/skus")
  public List<SkuWrapper> findSkusByProductById(@Context HttpServletRequest request,
      @PathParam("id") Long id) {
    logger.debug("Executing method : findSkusByProductById()");
    return super.findSkusByProductById(request, id);
  }

  /*
   * This method is used to get default sku for product based on product id
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findDefaultSkuByProductId (javax.servlet.http.HttpServletRequest, java.lang.Long)
   */
  @Override
  @GET
  @Path("product/{id}/defaultSku")
  public SkuWrapper findDefaultSkuByProductId(@Context HttpServletRequest request,
      @PathParam("id") Long id) {
    logger.debug("Executing method : findDefaultSkuByProductId()");
    return super.findDefaultSkuByProductId(request, id);
  }

  /*
   * This method is used to get all categories
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findAllCategories(javax .servlet.http.HttpServletRequest, java.lang.String, int, int)
   */
  @Override
  @GET
  @Path("categories")
  public CategoriesWrapper findAllCategories(@Context HttpServletRequest request,
      @QueryParam("name") String name, @QueryParam("limit") @DefaultValue("2000") int limit,
      @QueryParam("offset") @DefaultValue("0") int offset) {
    logger.debug("Executing method : findAllCategories()");
    request.setAttribute("subcategoryLimit", 20000);
    request.setAttribute("subcategoryOffset", 0);
    List<Category> categories;
    categories = catalogService.findAllParentCategories();
    CategoriesWrapper wrapper =
        (CategoriesWrapper) context.getBean(CategoriesWrapper.class.getName());
    wrapper.wrapDetails(getAllActiveCategories(categories), request);
    return wrapper;
  }

  /*
   * This method is used to get all root categories
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findAllCategories(javax .servlet.http.HttpServletRequest, java.lang.String, int, int)
   */
  @GET
  @Path("categories/root")
  public CategoriesWrapper findRootCategories(@Context HttpServletRequest request) {
    logger.debug("Executing method : findRootCategories()");
    List<Category> categories;
    categories = catalogService.findAllParentCategories();
    CategoriesWrapper wrapper =
        (CategoriesWrapper) context.getBean(CategoriesWrapper.class.getName());
    wrapper.wrapDetails(getAllActiveCategories(categories), request);
    return wrapper;
  }

  /*
   * This method is used to get sub categories
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findSubCategories(javax .servlet.http.HttpServletRequest, java.lang.Long, int, int, boolean)
   */
  @Override
  @GET
  @Path("category/{id}/categories")
  public CategoriesWrapper findSubCategories(@Context HttpServletRequest request,
      @PathParam("id") Long id, @QueryParam("limit") @DefaultValue("20") int limit,
      @QueryParam("offset") @DefaultValue("0") int offset,
      @QueryParam("active") @DefaultValue("true") boolean active) {
    logger.debug("Executing method : findSubCategories()");
    return super.findSubCategories(request, id, limit, offset, active);
  }

  /*
   * This method is used to get active sub categories
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findActiveSubCategories (javax.servlet.http.HttpServletRequest, java.lang.Long, int, int)
   */
  @Override
  @GET
  @Path("category/{id}/activeSubcategories")
  public CategoriesWrapper findActiveSubCategories(@Context HttpServletRequest request,
      @PathParam("id") Long id, @QueryParam("limit") @DefaultValue("20") int limit,
      @QueryParam("offset") @DefaultValue("0") int offset) {
    logger.debug("Executing method : findActiveSubCategories()");
    return super.findActiveSubCategories(request, id, limit, offset);
  }

  /*
   * This method is used to get category based on category id
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findCategoryById(javax. servlet.http.HttpServletRequest, java.lang.Long, int, int, int, int)
   */
  @Override
  @GET
  @Path("category/{id}")
  public CategoryWrapper findCategoryById(@Context HttpServletRequest request,
      @PathParam("id") Long id, @QueryParam("productLimit") @DefaultValue("20") int productLimit,
      @QueryParam("productOffset") @DefaultValue("1") int productOffset,
      @QueryParam("subcategoryLimit") @DefaultValue("20") int subcategoryLimit,
      @QueryParam("subcategoryOffset") @DefaultValue("1") int subcategoryOffset) {
    logger.debug("Executing method : findCategoryById()");
    Category cat = catalogService.findCategoryById(id);
    if (cat != null) {

      // Explicitly setting these request attributes because the
      // CategoryWrapper.wrap() method needs them
      request.setAttribute("productLimit", 20000);
      request.setAttribute("productOffset", 0);
      request.setAttribute("subcategoryLimit", 20000);
      request.setAttribute("subcategoryOffset", 0);

      CategoryWrapper wrapper = (CategoryWrapper) context.getBean(CategoryWrapper.class.getName());
      wrapper.wrapDetails(cat, request);
      return wrapper;
    }
    throw BroadleafWebServicesException.build(Response.Status.NOT_FOUND.getStatusCode())
        .addMessage(BroadleafWebServicesException.CATEGORY_NOT_FOUND, id);
  }

  /*
   * This method is used to get category based on category id or name
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findCategoryByIdOrName( javax.servlet.http.HttpServletRequest, java.lang.String, int, int, int,
   * int)
   */
  @Override
  @GET
  @Path("category")
  public CategoryWrapper findCategoryByIdOrName(@Context HttpServletRequest request,
      @QueryParam("searchParameter") String searchParameter,
      @QueryParam("productLimit") @DefaultValue("20") int productLimit,
      @QueryParam("productOffset") @DefaultValue("1") int productOffset,
      @QueryParam("subcategoryLimit") @DefaultValue("20") int subcategoryLimit,
      @QueryParam("subcategoryOffset") @DefaultValue("1") int subcategoryOffset) {
    logger.debug("Executing method : findCategoryByIdOrName()");
    return super.findCategoryByIdOrName(request, searchParameter, productLimit, productOffset,
        subcategoryLimit, subcategoryOffset);
  }

  /*
   * This method is used to get category attributes for category
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findCategoryAttributesForCategory(javax.servlet.http.HttpServletRequest, java.lang.Long)
   */
  @Override
  @GET
  @Path("category/{id}/category-attributes")
  public List<CategoryAttributeWrapper> findCategoryAttributesForCategory(
      @Context HttpServletRequest request, @PathParam("id") Long id) {
    logger.debug("Executing method : findCategoryAttributesForCategory()");
    return super.findCategoryAttributesForCategory(request, id);
  }

  /*
   * This method is used to get up sale product
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findUpSaleProductsByProduct (javax.servlet.http.HttpServletRequest, java.lang.Long, int, int)
   */
  @Override
  @GET
  @Path("product/{id}/related-products/upsale")
  public List<RelatedProductWrapper> findUpSaleProductsByProduct(
      @Context HttpServletRequest request, @PathParam("id") Long id,
      @QueryParam("limit") @DefaultValue("20") int limit,
      @QueryParam("offset") @DefaultValue("0") int offset) {
    logger.debug("Executing method : findUpSaleProductsByProduct()");
    return super.findUpSaleProductsByProduct(request, id, limit, offset);
  }

  /*
   * This method is used to get cross sale products
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findCrossSaleProductsByProduct (javax.servlet.http.HttpServletRequest, java.lang.Long, int,
   * int)
   */
  @Override
  @GET
  @Path("product/{id}/related-products/crosssale")
  public List<RelatedProductWrapper> findCrossSaleProductsByProduct(
      @Context HttpServletRequest request, @PathParam("id") Long id,
      @QueryParam("limit") @DefaultValue("20") int limit,
      @QueryParam("offset") @DefaultValue("0") int offset) {
    logger.debug("Executing method : findCrossSaleProductsByProduct()");
    return super.findCrossSaleProductsByProduct(request, id, limit, offset);
  }

  /*
   * This method is used to get product attributes for product
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findProductAttributesForProduct (javax.servlet.http.HttpServletRequest, java.lang.Long)
   */
  @Override
  @GET
  @Path("product/{id}/product-attributes")
  public List<ProductAttributeWrapper> findProductAttributesForProduct(
      @Context HttpServletRequest request, @PathParam("id") Long id) {
    logger.debug("Executing method : findProductAttributesForProduct()");
    return super.findProductAttributesForProduct(request, id);
  }

  /*
   * This method is used to get sku attributes for sku
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findSkuAttributesForSku (javax.servlet.http.HttpServletRequest, java.lang.Long)
   */
  @Override
  @GET
  @Path("sku/{id}/sku-attributes")
  public List<SkuAttributeWrapper> findSkuAttributesForSku(@Context HttpServletRequest request,
      @PathParam("id") Long id) {
    logger.debug("Executing method : findSkuAttributesForSku()");
    return super.findSkuAttributesForSku(request, id);
  }

  /*
   * This method is used to get media for sku
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findMediaForSku(javax.servlet .http.HttpServletRequest, java.lang.Long)
   */
  @Override
  @GET
  @Path("sku/{id}/media")
  public List<MediaWrapper> findMediaForSku(@Context HttpServletRequest request,
      @PathParam("id") Long id) {
    logger.debug("Executing method : findMediaForSku()");
    return super.findMediaForSku(request, id);
  }

  /*
   * This method is used to get sku based on sku id
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findSkuById(javax.servlet .http.HttpServletRequest, java.lang.Long)
   */
  @Override
  @GET
  @Path("sku/{id}")
  public SkuWrapper findSkuById(@Context HttpServletRequest request, @PathParam("id") Long id) {
    logger.debug("Executing method : findSkuById()");
    return super.findSkuById(request, id);
  }

  /*
   * This method is used to get inventory for sku
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findInventoryForSkus(javax .servlet.http.HttpServletRequest, java.util.List)
   */
  @Override
  @GET
  @Path("sku/inventory")
  public List<InventoryWrapper> findInventoryForSkus(@Context HttpServletRequest request,
      @QueryParam("id") List<Long> ids) {
    logger.debug("Executing method : findInventoryForSkus()");
    return super.findInventoryForSkus(request, ids);
  }

  /*
   * This method is used to get media for product
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findMediaForProduct(javax .servlet.http.HttpServletRequest, java.lang.Long)
   */
  @Override
  @GET
  @Path("product/{id}/media")
  public List<MediaWrapper> findMediaForProduct(@Context HttpServletRequest request,
      @PathParam("id") Long id) {
    logger.debug("Executing method : findMediaForProduct()");
    return super.findMediaForProduct(request, id);
  }

  /*
   * This method is used to get media for category
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findMediaForCategory(javax .servlet.http.HttpServletRequest, java.lang.Long)
   */
  @Override
  @GET
  @Path("category/{id}/media")
  public List<MediaWrapper> findMediaForCategory(@Context HttpServletRequest request,
      @PathParam("id") Long id) {
    logger.debug("Executing method : findMediaForCategory()");
    return super.findMediaForCategory(request, id);
  }

  /*
   * This method is used to get parent categories for product
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint#
   * findParentCategoriesForProduct (javax.servlet.http.HttpServletRequest, java.lang.Long)
   */
  @Override
  @GET
  @Path("product/{id}/categories")
  public CategoriesWrapper findParentCategoriesForProduct(@Context HttpServletRequest request,
      @PathParam("id") Long id) {
    logger.debug("Executing method : findParentCategoriesForProduct()");
    return super.findParentCategoriesForProduct(request, id);
  }

  /**
   * Get all active categories
   * 
   * @param categories
   * @return
   */
  private List<Category> getAllActiveCategories(List<Category> categories) {
    List<Category> categoriesActiveList = new ArrayList<Category>();
    if (categories != null)
      for (Category category : categories) {
        if (category != null && category.isActive()) {
          categoriesActiveList.add(category);
        }
      }
    return categoriesActiveList;
  }

  /**
   * Return paginated list
   * 
   * @param products
   * @param page
   * @param pageSize
   * @return
   */
  private List<Product> getProductPagination(List<Product> products, Integer page, Integer pageSize) {
    if (null != products && products.size() > 0) {
      int listSize = products.size();

      Set<Product> productList = new HashSet<Product>();
      for (int i = 0; i < listSize; i++) {
        productList.add(products.get(i));
      }

      products = new ArrayList<Product>(productList);
      listSize = products.size();

      int startIndex = (page - 1) * pageSize;
      int endIndex = startIndex + pageSize;

      if (listSize < endIndex) {
        endIndex = listSize;
      }
      if (listSize >= startIndex) {
        products = products.subList(startIndex, endIndex);
      } else {
        products.clear();
      }
    }
    return products;
  }
}
