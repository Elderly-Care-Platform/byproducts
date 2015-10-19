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

package com.beautifulyears.api.endpoint.cart;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.broadleafcommerce.core.web.api.wrapper.FulfillmentGroupItemWrapper;
import org.broadleafcommerce.core.web.api.wrapper.FulfillmentGroupWrapper;
import org.broadleafcommerce.core.web.api.wrapper.FulfillmentOptionWrapper;
import org.broadleafcommerce.core.web.api.wrapper.OrderWrapper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * This endpoint provide services related to fulfillment of the order
 * 
 * @author Aspire Software Solutions
 *
 */
@Component
@Scope("singleton")
@Path("/cart/fulfillment/")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class FulfillmentEndpoint extends
    org.broadleafcommerce.core.web.api.endpoint.order.FulfillmentEndpoint {

  final static Logger logger = Logger.getLogger(FulfillmentEndpoint.class);

  /*
   * This method is used to get fulfillment group for order
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.broadleafcommerce.core.web.api.endpoint.order.FulfillmentEndpoint#findFulfillmentGroupsForOrder
   * (javax.servlet.http.HttpServletRequest)
   */
  @Override
  @GET
  @Path("groups")
  public List<FulfillmentGroupWrapper> findFulfillmentGroupsForOrder(
      @Context HttpServletRequest request) {
    logger.debug("Executing method : findFulfillmentGroupsForOrder()");
    return super.findFulfillmentGroupsForOrder(request);
  }

  /*
   * This method is used to remove fulfillment group from the order
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.order.FulfillmentEndpoint#
   * removeAllFulfillmentGroupsFromOrder(javax.servlet.http.HttpServletRequest, boolean)
   */
  @Override
  @DELETE
  @Path("groups")
  public OrderWrapper removeAllFulfillmentGroupsFromOrder(@Context HttpServletRequest request,
      @QueryParam("priceOrder") @DefaultValue("true") boolean priceOrder) {
    logger.debug("Executing method : removeAllFulfillmentGroupsFromOrder()");
    return super.removeAllFulfillmentGroupsFromOrder(request, priceOrder);
  }

  /*
   * This method is used to add fulfillment group to the order
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.broadleafcommerce.core.web.api.endpoint.order.FulfillmentEndpoint#addFulfillmentGroupToOrder
   * (javax.servlet.http.HttpServletRequest,
   * org.broadleafcommerce.core.web.api.wrapper.FulfillmentGroupWrapper, boolean)
   */
  @Override
  @POST
  @Path("group")
  public FulfillmentGroupWrapper addFulfillmentGroupToOrder(@Context HttpServletRequest request,
      FulfillmentGroupWrapper wrapper,
      @QueryParam("priceOrder") @DefaultValue("true") boolean priceOrder) {
    logger.debug("Executing method : addFulfillmentGroupToOrder()");
    return super.addFulfillmentGroupToOrder(request, wrapper, priceOrder);
  }

  /*
   * This method is used to add item to fulfillment group
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.broadleafcommerce.core.web.api.endpoint.order.FulfillmentEndpoint#addItemToFulfillmentGroup
   * (javax.servlet.http.HttpServletRequest, java.lang.Long,
   * org.broadleafcommerce.core.web.api.wrapper.FulfillmentGroupItemWrapper, boolean)
   */
  @Override
  @PUT
  @Path("group/{fulfillmentGroupId}")
  public FulfillmentGroupWrapper addItemToFulfillmentGroup(@Context HttpServletRequest request,
      @PathParam("fulfillmentGroupId") Long fulfillmentGroupId,
      FulfillmentGroupItemWrapper wrapper,
      @QueryParam("priceOrder") @DefaultValue("true") boolean priceOrder) {
    logger.debug("Executing method : addItemToFulfillmentGroup()");
    return super.addItemToFulfillmentGroup(request, fulfillmentGroupId, wrapper, priceOrder);
  }

  /*
   * This method is used to add fulfillment options to fulfillment group
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.order.FulfillmentEndpoint#
   * addFulfillmentOptionToFulfillmentGroup(javax.servlet.http.HttpServletRequest, java.lang.Long,
   * java.lang.Long, boolean)
   */
  @Override
  @PUT
  @Path("group/{fulfillmentGroupId}/option/{fulfillmentOptionId}")
  public FulfillmentGroupWrapper addFulfillmentOptionToFulfillmentGroup(
      @Context HttpServletRequest request,
      @PathParam("fulfillmentGroupId") Long fulfillmentGroupId,
      @PathParam("fulfillmentOptionId") Long fulfillmentOptionId,
      @QueryParam("priceOrder") @DefaultValue("true") boolean priceOrder) {
    logger.debug("Executing method : addFulfillmentOptionToFulfillmentGroup()");
    return super.addFulfillmentOptionToFulfillmentGroup(request, fulfillmentGroupId,
        fulfillmentOptionId, priceOrder);
  }

  /*
   * This method is used to get fulfillment options from the fulfillment group
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.broadleafcommerce.core.web.api.endpoint.order.FulfillmentEndpoint#findFulfillmentOptions
   * (javax.servlet.http.HttpServletRequest, java.lang.String)
   */
  @Override
  @GET
  @Path("options")
  public List<FulfillmentOptionWrapper> findFulfillmentOptions(@Context HttpServletRequest request,
      @QueryParam("fulfillmentType") String fulfillmentType) {
    logger.debug("Executing method : findFulfillmentOptions()");
    return super.findFulfillmentOptions(request, fulfillmentType);
  }
}
