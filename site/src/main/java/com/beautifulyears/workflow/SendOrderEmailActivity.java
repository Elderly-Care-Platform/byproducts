/**
 * 
 */
package com.beautifulyears.workflow;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.ws.rs.core.Response;

import org.broadleafcommerce.common.payment.PaymentType;
import org.broadleafcommerce.core.checkout.service.workflow.CheckoutSeed;
import org.broadleafcommerce.core.order.domain.FulfillmentGroup;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.domain.OrderAttribute;
import org.broadleafcommerce.core.order.domain.OrderAttributeImpl;
import org.broadleafcommerce.core.order.domain.OrderItem;
import org.broadleafcommerce.core.order.domain.OrderItemAttribute;
import org.broadleafcommerce.core.order.domain.OrderItemAttributeImpl;
import org.broadleafcommerce.core.order.service.OrderService;
import org.broadleafcommerce.core.pricing.service.exception.PricingException;
import org.broadleafcommerce.core.web.api.BroadleafWebServicesException;
import org.broadleafcommerce.core.workflow.BaseActivity;
import org.broadleafcommerce.core.workflow.ProcessContext;

import com.beautifulyears.BYConstants;
import com.beautifulyears.sample.profile.domain.ExtendAddress;
import com.beautifulyears.service.email.ExtendEmailService;
import com.beautifulyears.service.logistic.awb.AwbService;

/**
 * @author Nitin
 *
 */
public class SendOrderEmailActivity extends
		BaseActivity<ProcessContext<CheckoutSeed>> {

	@Resource(name = "blAwbService")
	protected AwbService awbService;

	@Resource(name = "blOrderService")
	protected OrderService orderService;

	@Resource(name = "extendEmailService")
	protected ExtendEmailService emailService;

	public SendOrderEmailActivity() {
		// no specific state to set here for the rollback handler; it's always
		// safe for it to run
		setAutomaticallyRegisterRollbackHandler(true);
	}

	@Override
	public ProcessContext<CheckoutSeed> execute(
			ProcessContext<CheckoutSeed> context) throws Exception {
		CheckoutSeed seed = context.getSeedData();

		try {
			ExtendAddress address = null;
			for (FulfillmentGroup fulfillment : seed.getOrder()
					.getFulfillmentGroups()) {
				address = (ExtendAddress) fulfillment.getAddress();
			}
			if (null != address.getPrimaryEmail()) {
				emailService.sendOrderConfirmation(seed.getOrder(), null,
						address.getPrimaryEmail());
			}
			for (String adminEmail : BYConstants.ADMIN_EMAILS) {
				emailService.sendOrderConfirmationAdmin(seed.getOrder(), null,
						adminEmail);
			}

			for (OrderItem item : seed.getOrder().getOrderItems()) {
				for (String adminEmail : BYConstants.ADMIN_EMAILS) {
					emailService.sendOrderItemConfirmation(seed.getOrder(),
							item, adminEmail);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("error sending emails for the order - "+seed.getOrder().getOrderNumber());
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("error sending emails for the order - "+seed.getOrder().getOrderNumber());
		}
		catch (Error er){
			er.printStackTrace();
			System.out.println("error sending emails for the order - "+seed.getOrder().getOrderNumber());
		}
		return context;
	}

}