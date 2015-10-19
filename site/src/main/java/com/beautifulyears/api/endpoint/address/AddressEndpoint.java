package com.beautifulyears.api.endpoint.address;

import java.util.ArrayList;
import java.util.List;

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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.broadleafcommerce.core.web.api.endpoint.BaseEndpoint;
import org.broadleafcommerce.core.web.api.wrapper.AddressWrapper;
import org.broadleafcommerce.profile.core.domain.Address;
import org.broadleafcommerce.profile.core.domain.Customer;
import org.broadleafcommerce.profile.core.domain.CustomerAddress;
import org.broadleafcommerce.profile.core.domain.CustomerAddressImpl;
import org.broadleafcommerce.profile.core.service.AddressService;
import org.broadleafcommerce.profile.core.service.CustomerAddressService;
import org.broadleafcommerce.profile.core.service.CustomerService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.beautifulyears.api.wrapper.CustomerAddressWrapper;
import com.beautifulyears.api.wrapper.ExtendAddressWrapper;
import com.beautifulyears.sample.profile.domain.ExtendAddress;

/**
 * This endpoint provides services related to CRUD of customer address.
 * 
 * @author Aspire Software Solutions
 */
@Component
@Scope("singleton")
@Path("/address/")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class AddressEndpoint extends BaseEndpoint {

  final static Logger logger = Logger.getLogger(AddressEndpoint.class);

  @Resource(name = "blAddressService")
  protected AddressService addressService;

  @Resource(name = "blCustomerAddressService")
  protected CustomerAddressService customerAddressService;

  @Resource(name = "blCustomerService")
  protected CustomerService customerService;

  /**
   * This method is used to add multiple shipping address
   * 
   * @param request
   * @param wrapper
   * @param customerId
   * @return
   */
  @POST
  @Path("add")
  public AddressWrapper addAddress(@Context HttpServletRequest request,
      ExtendAddressWrapper wrapper, @QueryParam("customerId") Long customerId) {
    logger.debug("Executing method : addAddress()");
    // Unwrap input and save address
    ExtendAddress address = wrapper.unwrap(request, context);
    address = (ExtendAddress) addressService.saveAddress(address);
    // Get instance of CustomerAddress and save multiple address for user
    CustomerAddress customerAddress = new CustomerAddressImpl();
    logger.info("Getting customer with customer id : " + customerId);
    Customer customer = customerService.readCustomerById(customerId);
    customerAddress.setCustomer(customer);
    customerAddress.setAddress(address);
    @SuppressWarnings("unused")
    CustomerAddress savedCustomerAddress =
        customerAddressService.saveCustomerAddress(customerAddress);
    AddressWrapper addressWrapper =
        (AddressWrapper) context.getBean(AddressWrapper.class.getName());
    addressWrapper.wrapSummary(address, request);
    return addressWrapper;
  }

  /**
   * Get Address based on id
   * 
   * @param request
   * @param addressId
   * @return
   */
  @GET
  @Path("/get/{addressId}")
  public AddressWrapper getAddress(@Context HttpServletRequest request,
      @PathParam("addressId") Long addressId) {
    logger.debug("Executing method : getAddress");
    Address address = addressService.readAddressById(addressId);
    AddressWrapper addressWrapper =
        (AddressWrapper) context.getBean(AddressWrapper.class.getName());
    addressWrapper.wrapSummary(address, request);
    return addressWrapper;
  }

  /**
   * Get list of shipping addresses for a particular customer
   * 
   * @param request
   * @param customerId
   * @return
   */
  @GET
  @Path("{customerId}")
  public List<CustomerAddressWrapper> getListOfAddress(@Context HttpServletRequest request,
      @PathParam("customerId") Long customerId) {
    logger.debug("Executing method : getListOfAddress()");
    List<CustomerAddress> addressList =
        customerAddressService.readActiveCustomerAddressesByCustomerId(customerId);
    List<CustomerAddressWrapper> customerAddressList = new ArrayList<CustomerAddressWrapper>();
    for (CustomerAddress customerAddress : addressList) {
      CustomerAddressWrapper customerAddressWrapper =
          (CustomerAddressWrapper) context.getBean(CustomerAddressWrapper.class.getName());
      customerAddressWrapper.wrapSummary(customerAddress, request);
      customerAddressList.add(customerAddressWrapper);
    }
    return customerAddressList;
  }

  /**
   * This method is used to edit shipping address
   * 
   * @param request
   * @param addressId
   * @param wrapper
   * @param customerId
   * @return
   */
  @PUT
  @Path("edit/{addressId}")
  public AddressWrapper editAddress(@Context HttpServletRequest request,
      @PathParam("addressId") Long addressId, ExtendAddressWrapper wrapper,
      @QueryParam("customerId") Long customerId) {
    logger.debug("Executing method : editAddress()");
    // Unwrap input and edit address
    ExtendAddress address = wrapper.unwrap(request, context);
    address = (ExtendAddress) addressService.saveAddress(address);
    AddressWrapper addressWrapper =
        (AddressWrapper) context.getBean(AddressWrapper.class.getName());
    addressWrapper.wrapSummary(address, request);
    return addressWrapper;
  }

  /**
   * This method is used to delete shipping address
   * 
   * @param request
   * @param customerAddressId
   * @param customerId
   * @return
   */
  @DELETE
  @Path("{customerAddressId}")
  public CustomerAddressWrapper removeAddressById(@Context HttpServletRequest request,
      @PathParam("customerAddressId") Long customerAddressId,
      @QueryParam("customerId") Long customerId) {
    logger.debug("Executing method : removeAddressById()");
    CustomerAddress customerAddress =
        customerAddressService.readCustomerAddressById(customerAddressId);
    CustomerAddressWrapper customerAddressWrapper =
        (CustomerAddressWrapper) context.getBean(CustomerAddressWrapper.class.getName());
    customerAddressWrapper.wrapSummary(customerAddress, request);
    customerAddressService.deleteCustomerAddressById(customerAddressId);
    return customerAddressWrapper;
  }
}
