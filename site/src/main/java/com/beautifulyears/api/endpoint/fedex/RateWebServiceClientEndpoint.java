package com.beautifulyears.api.endpoint.fedex;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.broadleafcommerce.core.web.api.endpoint.BaseEndpoint;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.beautifulyears.api.wrapper.CancelPendingShipmentServiceWrapper;
import com.beautifulyears.api.wrapper.RateWebServiceWrapper;
import com.beautifulyears.domain.fedex.CancelPendingShipmentWebService;
import com.beautifulyears.domain.fedex.RateWebService;
import com.beautifulyears.webserviceclient.CancelPendingShipmentWebServiceClient;
import com.beautifulyears.webserviceclient.RateWebServiceClient;

/**
 * This endpoint provides rest for RateWebServiceClient of FedEx.
 * 
 * @author Aspire Software Solutions
 *
 */
@Component
@Scope("singleton")
@Path("/fedex/")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class RateWebServiceClientEndpoint extends BaseEndpoint {

  final static Logger logger = Logger.getLogger(RateWebServiceClientEndpoint.class);

  /**
   * This method is used to get Rate web Service details of FedEx
   * 
   * @param request
   * @return
   */
  @GET
  @Path("rate")
  public RateWebServiceWrapper getRateWebService(@Context HttpServletRequest request) {
    // Pass this as an argument in this method when address will be passed dynamically
    // ExtendOrderWrapper orderWrapper

    logger.debug("Executing method : getRateWebService");

    // Uncomment the Code to get the address dynamically
    /*
     * Address address = null; Order order = null; // Get the unwrapped order from the wrapper try {
     * order = orderWrapper.unwrap(request, context); } catch (NullPointerException e) { throw
     * BroadleafWebServicesException.build(Response.Status.NOT_FOUND.getStatusCode())
     * .addMessage(BroadleafWebServicesException.CART_NOT_FOUND); } for (FulfillmentGroup
     * fulfillment : order.getFulfillmentGroups()) { address = fulfillment.getAddress(); }
     * 
     * System.out.println("************Address************" + address);
     */

    RateWebService model = RateWebServiceClient.getFedexServiceRates(/* address */);
    RateWebServiceWrapper rateWebServiceWrapper =
        (RateWebServiceWrapper) context.getBean(RateWebServiceWrapper.class.getName());
    rateWebServiceWrapper.wrapSummary(model, request);
    return rateWebServiceWrapper;
  }

  @DELETE
  @Path("cancelPendingShipment")
  public CancelPendingShipmentServiceWrapper getCancelPendingShipmentService(
      @Context HttpServletRequest request, @QueryParam("trackingNumber") String trackingNumber) {
    CancelPendingShipmentWebService model = CancelPendingShipmentWebServiceClient.cancelPendingShipmentWebService(trackingNumber);
    CancelPendingShipmentServiceWrapper cancelPendingShipmentServiceWrapper =
        (CancelPendingShipmentServiceWrapper) context
            .getBean(CancelPendingShipmentServiceWrapper.class.getName());
    cancelPendingShipmentServiceWrapper.wrapSummary(model, request);
    return cancelPendingShipmentServiceWrapper;
  }
}
