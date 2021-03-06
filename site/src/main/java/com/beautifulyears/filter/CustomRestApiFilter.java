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
import org.broadleafcommerce.profile.web.core.CustomerState;
import org.broadleafcommerce.profile.web.core.security.CustomerStateRequestProcessor;
import org.broadleafcommerce.profile.web.core.security.RestApiCustomerStateFilter;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.core.Ordered;
import org.springframework.web.filter.GenericFilterBean;

import util.RestCallHandler;

import com.beautifulyears.BYConstants;
import com.beautifulyears.sample.profile.domain.ExtendCustomer;
import com.beautifulyears.sample.profile.domain.ExtendCustomerImpl;
import com.beautifulyears.service.customer.ExtendCustomerService;

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
		ExtendCustomer existingCustomer = null;

		HttpServletRequest request = (HttpServletRequest) servletRequest;

		// If someone already set the customer on the request then we don't need
		// to do anything.
		if (request.getAttribute(CustomerStateRequestProcessor
				.getCustomerRequestAttributeName()) == null) {

			System.out.println("new request params = "+request.getHeader("userId") + " , "
					+ request.getHeader("sessionId") + " , "
					+ request.getHeader("email") + " , "
					+ request.getHeader("userName") + " , "
					+ request.getHeader("sessionType"));
			if (null != request.getHeader("userId")
					&& null != request.getHeader("sessionId")
					&& null != request.getHeader("email")
					&& null != request.getHeader("userName")
					&& null != request.getHeader("sessionType")) {
				request.setAttribute("sessionType",
						Integer.parseInt(request.getHeader("sessionType")));

				sessionId = request.getHeader("sessionId");

				String customUserId = request.getHeader("userId");
				existingCustomer = (ExtendCustomerImpl) customerService
						.getByCustomUserId(customUserId);

				if (null == existingCustomer) {
					existingCustomer = new ExtendCustomerImpl();
					existingCustomer.setId((new Date()).getTime());
				}

				existingCustomer.setEmailAddress(request.getHeader("email"));
				existingCustomer.setUsername(request.getHeader("userName"));
				existingCustomer.setCustomUserId(request.getHeader("userId"));

				customerService.saveCustomer(existingCustomer);
				if (existingCustomer != null) {
					CustomerState.setCustomer(existingCustomer);
				}
			} else {

				// First check to see if someone already put the customerId on
				// the
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
					if ((sessionId == null || sessionId.length() < 1)
							&& customerId == null) {
						// If it's not on the request attribute, try the
						// parameter
						customerId = servletRequest
								.getParameter(customerIdAttributeName);
					}
				}

				if ((sessionId == null || sessionId.length() < 1)) {
					// If it's not on the request parameter, look on the header
					sessionId = request.getHeader(sessionIdAttributeName);
					if (sessionId == null && customerId == null) {
						// If it's not on the request parameter, look on the
						// header
						sessionId = request.getHeader(customerIdAttributeName);
					}
				}

				if (sessionId != null && sessionId.trim().length() > 0) {

					String obj = RestCallHandler.query(BYConstants.SITE_URL
							+ "/api/v1/users/getUserInfoByIdForProducts?id="
							+ sessionId);
					System.out
							.println("making the query to get customer info -> "
									+ BYConstants.SITE_URL
									+ "/api/v1/users/getUserInfoByIdForProducts?id="
									+ sessionId);
					System.out.println(obj);
					try {

						JSONObject json1 = new JSONObject(obj);
						JSONObject session = json1.getJSONObject("data");
						JSONObject user = session.getJSONObject("user");

						request.setAttribute("sessionType",
								session.getInt("sessionType"));

						String customUserId = user.getString("id");
						existingCustomer = (ExtendCustomerImpl) customerService
								.getByCustomUserId(customUserId);

						if (null == existingCustomer) {
							existingCustomer = new ExtendCustomerImpl();
							existingCustomer.setId((new Date()).getTime());
						}

						existingCustomer.setEmailAddress(user
								.getString("email"));
						existingCustomer
								.setUsername(user.getString("userName"));
						existingCustomer.setCustomUserId(user.getString("id"));

						customerService.saveCustomer(existingCustomer);
					} catch (JSONException e) {
						e.printStackTrace();
					}
					if (existingCustomer != null) {
						CustomerState.setCustomer(existingCustomer);
					}
				}
			}

			if ((sessionId == null || sessionId.length() < 1)
					&& customerId != null) {
				Customer customer = customerService.readCustomerById(Long
						.valueOf(customerId));
				CustomerState.setCustomer(customer);
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
