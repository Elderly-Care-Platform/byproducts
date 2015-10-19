package com.beautifulyears.api.wrapper;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.broadleafcommerce.core.catalog.domain.Category;
import org.broadleafcommerce.core.catalog.domain.CategoryAttribute;
import org.broadleafcommerce.core.catalog.domain.Product;
import org.broadleafcommerce.core.catalog.service.CatalogService;
import org.broadleafcommerce.core.search.service.SearchService;
import org.broadleafcommerce.core.web.api.wrapper.CategoryAttributeWrapper;
import org.broadleafcommerce.core.web.api.wrapper.CategoryWrapper;
import org.broadleafcommerce.core.web.api.wrapper.ProductWrapper;

/**
 * This is a JAXB wrapper class for wrapping a collection of categories.
 */
@XmlRootElement(name = "category")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class ExtendCategoryWrapper extends CategoryWrapper {

  protected List<Product> productList = new ArrayList<Product>();

  @SuppressWarnings("deprecation")
  @Override
  public void wrapDetails(Category category, HttpServletRequest request) {
    this.id = category.getId();
    this.name = category.getName();
    this.description = category.getDescription();
    this.active = category.isActive();
    this.activeStartDate = category.getActiveStartDate();
    this.activeEndDate = category.getActiveEndDate();
    this.url = category.getUrl();
    this.urlKey = category.getUrlKey();

    if (category.getCategoryAttributes() != null && !category.getCategoryAttributes().isEmpty()) {
      categoryAttributes = new ArrayList<CategoryAttributeWrapper>();
      for (CategoryAttribute attribute : category.getCategoryAttributes()) {
        CategoryAttributeWrapper wrapper =
            (CategoryAttributeWrapper) context.getBean(CategoryAttributeWrapper.class.getName());
        wrapper.wrapSummary(attribute, request);
        categoryAttributes.add(wrapper);
      }
    }

    Integer productLimit = (Integer) request.getAttribute("productLimit");
    Integer productOffset = (Integer) request.getAttribute("productOffset");
    Integer subcategoryLimit = (Integer) request.getAttribute("subcategoryLimit");
    Integer subcategoryOffset = (Integer) request.getAttribute("subcategoryOffset");

    if (productLimit != null && productOffset == null) {
      productOffset = 1;
    }

    if (subcategoryLimit != null && subcategoryOffset == null) {
      subcategoryOffset = 1;
    }

    if (productLimit != null && productOffset != null) {
      CatalogService catalogService = (CatalogService) context.getBean("blCatalogService");
      List<Product> productList = catalogService.findActiveProductsByCategory(category);
      if (productList != null && !productList.isEmpty()) {
        if (products == null) {
          products = new ArrayList<ProductWrapper>();
        }

        for (Product p : productList) {
          ProductWrapper productSummaryWrapper =
              (ProductWrapper) context.getBean(ProductWrapper.class.getName());
          productSummaryWrapper.wrapSummary(p, request);
          products.add(productSummaryWrapper);
        }
      }
    }

    if (subcategoryLimit != null && subcategoryOffset != null) {
      subcategories = buildSubcategoryTree(subcategories, category, request);
    }
  }

  /*
   * Override wrapSUmmary method to add subcategories in summary
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.CategoryWrapper#wrapSummary
   * (org.broadleafcommerce.core.catalog.domain.Category, javax.servlet.http.HttpServletRequest)
   */
  @Override
  public void wrapSummary(Category category, HttpServletRequest request) {
    /*
     * super.wrapSummary(category, request); super.wrapDetails(category, request);
     */
    this.id = category.getId();
    this.name = category.getName();
    this.description = category.getDescription();
    this.active = category.isActive();
    wrapDetails(category, request);
  }

  /*
   * Buid tree structure of category and subcategories
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.CategoryWrapper#
   * buildSubcategoryTree(java.util.List, org.broadleafcommerce.core.catalog.domain.Category,
   * javax.servlet.http.HttpServletRequest)
   */
  protected List<CategoryWrapper> buildSubcategoryTree(List<CategoryWrapper> wrappers,
      Category root, HttpServletRequest request) {
    CatalogService catalogService = (CatalogService) context.getBean("blCatalogService");

    Integer subcategoryLimit = (Integer) request.getAttribute("subcategoryLimit");
    Integer subcategoryOffset = (Integer) request.getAttribute("subcategoryOffset");

    List<Category> subcategories =
        catalogService.findActiveSubCategoriesByCategory(root, subcategoryLimit, subcategoryOffset);
    if (subcategories != null && !subcategories.isEmpty() && wrappers == null) {
      wrappers = new ArrayList<CategoryWrapper>();
    }

    for (Category c : subcategories) {
      CategoryWrapper subcategoryWrapper =
          (CategoryWrapper) context.getBean(CategoryWrapper.class.getName());
      subcategoryWrapper.wrapSummary(c, request);
      wrappers.add(subcategoryWrapper);
    }

    return wrappers;
  }

  protected SearchService getSearchService() {
    return (SearchService) context.getBean("blSearchService");
  }
}
