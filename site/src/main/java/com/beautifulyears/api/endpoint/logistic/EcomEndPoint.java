/**
 * 
 */
package com.beautifulyears.api.endpoint.logistic;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.beautifulyears.sample.logistic.domain.PincodeImpl;
import com.beautifulyears.service.logistic.awb.AwbService;
import com.beautifulyears.service.logistic.pincode.PincodeService;

/**
 * @author Nitin
 *
 */
@Component
@Scope("singleton")
@Path("/logistic/")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class EcomEndPoint {

	@Resource(name = "blPincodeService")
	protected PincodeService pincodeService;
	
	@Resource(name = "blAwbService")
	protected AwbService awbService;
	
	final static Logger logger = Logger.getLogger(EcomEndPoint.class);
	
	  @GET
	  @Path("pincode/{pincode}")
	  public PincodeImpl findPincode(@Context HttpServletRequest request,
			  @PathParam("pincode") Long pincode) {
	    logger.debug("Executing method : findCartForCustomer()");
	    PincodeImpl pincodeImpl =  pincodeService.find(pincode);
	    return pincodeImpl;
	  }
	  
	  @GET
	  @Path("track")
	  public Object track(@Context HttpServletRequest request,
			  @QueryParam("awb") List<String> awb) {
		  logger.debug("Executing method : track()");
		return  awbService.track(awb);
	    
	    
	  }
}
