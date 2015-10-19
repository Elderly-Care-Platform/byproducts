package com.beautifulyears.api.endpoint.customer;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.broadleafcommerce.core.web.api.endpoint.BaseEndpoint;
import org.broadleafcommerce.core.web.api.wrapper.CustomerWrapper;
import org.broadleafcommerce.profile.core.domain.Customer;
import org.broadleafcommerce.profile.core.service.CustomerService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.beautifulyears.api.endpoint.address.AddressEndpoint;
import com.beautifulyears.api.wrapper.ExtendCustomerWrapper;

/**
 * This endpoint provides services related to CRUD of customer.
 * 
 * @author Aspire Software Solutions
 */
@Component
@Scope("singleton")
@Path("/user/")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class CustomerEndpoint extends BaseEndpoint {

  final static Logger logger = Logger.getLogger(AddressEndpoint.class);

  @Resource(name = "blCustomerService")
  protected CustomerService customerService;

  /**
   * This method is used to add Customer
   * 
   * @param request
   * @param wrapper
   * @return
   */
  @POST
  @Path("add")
  public CustomerWrapper addCustomer(@Context HttpServletRequest request,
      ExtendCustomerWrapper wrapper) {
    logger.debug("Executing method : addCustomer()");
    // Unwrap input and save Customer
    Customer customer = wrapper.unwrap(request, context);
    customer.setUsername(String.valueOf(customer.getId()));
    customer.setRegistered(true);
    customer = customerService.saveCustomer(customer);
    CustomerWrapper customerWrapper =
        (CustomerWrapper) context.getBean(CustomerWrapper.class.getName());
    customerWrapper.wrapSummary(customer, request);
    return customerWrapper;
  }

  /**
   * This method is used to edit customer
   * 
   * @param request
   * @param customerId
   * @param wrapper
   * @return
   */
  @PUT
  @Path("edit/{customerId}")
  public CustomerWrapper editCustomer(@Context HttpServletRequest request,
      @PathParam("customerId") Long customerId, ExtendCustomerWrapper wrapper) {
    logger.debug("Executing method : editCustomer()");
    // Unwrap input and edit customer
    Customer customer = wrapper.unwrap(request, context);
    customer = customerService.saveCustomer(customer);
    CustomerWrapper customerWrapper =
        (CustomerWrapper) context.getBean(CustomerWrapper.class.getName());
    customerWrapper.wrapSummary(customer, request);
    return customerWrapper;
  }

  /**
   * This method is used to delete customer
   * 
   * @param request
   * @param customerId
   * @return
   */
  @DELETE
  @Path("{customerId}")
  public CustomerWrapper removeCustomerById(@Context HttpServletRequest request,
      @PathParam("customerId") Long customerId) {
    logger.debug("Executing method : removeCustomerById()");
    // Get customer information based on ID
    Customer customer = customerService.readCustomerById(customerId);
    // Delete the customer
    customerService.deleteCustomer(customer);
    // Wrap customer to show result in json format
    CustomerWrapper customerWrapper =
        (CustomerWrapper) context.getBean(CustomerWrapper.class.getName());
    customerWrapper.wrapSummary(customer, request);
    return customerWrapper;
  }

  /**
   * This method is used to get customer information based on customeID
   * 
   * @param request
   * @param customerId
   * @return
   */
  @GET
  @Path("{customerId}")
  public CustomerWrapper getCustomerById(@Context HttpServletRequest request,
      @PathParam("customerId") Long customerId) {
    logger.debug("Executing method : getCustomerById()");
    // Get customer based on customer ID
    Customer customer = customerService.readCustomerById(customerId);
    CustomerWrapper customerWrapper =
        (CustomerWrapper) context.getBean(CustomerWrapper.class.getName());
    customerWrapper.wrapSummary(customer, request);
    return customerWrapper;
  }
}
