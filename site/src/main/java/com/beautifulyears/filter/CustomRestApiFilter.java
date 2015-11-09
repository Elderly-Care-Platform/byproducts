package com.beautifulyears.filter;

import java.io.IOException;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.broadleafcommerce.profile.core.domain.Customer;
import org.broadleafcommerce.profile.core.domain.CustomerImpl;
import org.broadleafcommerce.profile.core.service.CustomerService;
import org.broadleafcommerce.profile.web.core.CustomerState;
import org.broadleafcommerce.profile.web.core.security.CustomerStateRequestProcessor;
import org.broadleafcommerce.profile.web.core.security.RestApiCustomerStateFilter;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.core.Ordered;
import org.springframework.web.filter.GenericFilterBean;

import com.beautifulyears.sample.profile.domain.ExtendCustomer;
import com.beautifulyears.sample.profile.domain.ExtendCustomerImpl;
import com.beautifulyears.service.customer.ExtendCustomerService;

import util.RestCallHandler;

public class CustomRestApiFilter extends GenericFilterBean implements Ordered {

	protected static final Log LOG = LogFactory
			.getLog(RestApiCustomerStateFilter.class);

	@Resource(name = "blCustomerService")
	protected ExtendCustomerService customerService;

	protected String sessionIdAttributeName = "sess";
	protected String customerIdAttributeName = "customerId";

	@Override
	public void doFilter(ServletRequest servletRequest,
			ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {

		String sessionId = null;
		String customerId = null;

		HttpServletRequest request = (HttpServletRequest) servletRequest;

		// If someone already set the customer on the request then we don't need
		// to do anything.
		if (request.getAttribute(CustomerStateRequestProcessor
				.getCustomerRequestAttributeName()) == null) {

			// First check to see if someone already put the customerId on the
			// request
			if (request.getAttribute(sessionIdAttributeName) != null) {
				sessionId = String.valueOf(request
						.getAttribute(sessionIdAttributeName));
				 if (request.getAttribute(customerIdAttributeName) != null) {
						customerId = String.valueOf(request
								.getAttribute(customerIdAttributeName));
					}
			}

			if (sessionId == null || sessionId.length() < 1) {
				// If it's not on the request attribute, try the parameter
				sessionId = servletRequest
						.getParameter(sessionIdAttributeName);
				if ((sessionId == null  || sessionId.length() < 1) && customerId == null) {
					// If it's not on the request attribute, try the parameter
					customerId = servletRequest
							.getParameter(customerIdAttributeName);
				}
			} 

			if ((sessionId == null  || sessionId.length() < 1)) {
				// If it's not on the request parameter, look on the header
				sessionId = request.getHeader(sessionIdAttributeName);
				if (sessionId == null && customerId == null) {
					// If it's not on the request parameter, look on the header
					sessionId = request.getHeader(customerIdAttributeName);
				}
			}
			
			if (sessionId != null && sessionId.trim().length() > 0) {

				// if (NumberUtils.isNumber(customerId)) {
				// If we found it, look up the customer and put it on the
				// request.
				// Customer customer =
				// customerService.readCustomerById(Long.valueOf(customerId));
				String obj = RestCallHandler
						.query("http://localhost:8080/api/v1/users/getUserInfoByIdForProducts?id="+sessionId);
//						.query("http://dev.beautifulyears.com:8083/products/api/v1/users/getUserInfoByIdForProducts?id="+sessionId);
				System.out.println(obj);
				ExtendCustomer existingCustomer = null;
				try {

					
					JSONObject json1 = new JSONObject(obj);
					JSONObject data = json1.getJSONObject("data");

					String customUserId = data.getString("id");
					existingCustomer = (ExtendCustomerImpl) customerService
							.getByCustomUserId(customUserId);

					if (null == existingCustomer) {
						existingCustomer = new ExtendCustomerImpl();
						existingCustomer.setId((new Date()).getTime());
					}

					existingCustomer.setEmailAddress(data.getString("email"));
					existingCustomer.setUsername(data.getString("userName"));
					existingCustomer.setCustomUserId(data.getString("id"));
					
					customerService.saveCustomer(existingCustomer);
				} catch (JSONException e) {
					e.printStackTrace();
				}
				if (existingCustomer != null) {
					CustomerState.setCustomer(existingCustomer);
				}
				// } else {
				// LOG.warn(String.format("The customer id passed in '%s' was not a number",
				// customerId));
				// }
			}

			if ((sessionId == null  || sessionId.length() < 1)) {
				if(customerId != null){
					 Customer customer =
							 customerService.readCustomerById(Long.valueOf(customerId));
					 CustomerState.setCustomer(customer);
				}			
				
				if (LOG.isDebugEnabled()) {
					LOG.debug("No customer ID was found for the API request. In order to look up a customer for the request"
							+ " send a request parameter or request header for the '"
							+ sessionIdAttributeName + "' attribute");
				}
			}
		}

		filterChain.doFilter(request, servletResponse);

	}

	@Override
	public int getOrder() {
		return 2000;
	}

	public String getCustomerIdAttributeName() {
		return sessionIdAttributeName;
	}

	public void setCustomerIdAttributeName(String customerIdAttributeName) {
		if (customerIdAttributeName == null
				|| customerIdAttributeName.trim().length() < 1) {
			throw new IllegalArgumentException(
					"customerIdAttributeName cannot be null");
		}
		this.sessionIdAttributeName = customerIdAttributeName;
	}
}
