/**
 * 
 */
package com.beautifulyears.workflow;

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
import org.broadleafcommerce.core.order.service.type.FulfillmentType;
import org.broadleafcommerce.core.pricing.service.exception.PricingException;
import org.broadleafcommerce.core.web.api.BroadleafWebServicesException;
import org.broadleafcommerce.core.workflow.BaseActivity;
import org.broadleafcommerce.core.workflow.ProcessContext;

import com.beautifulyears.service.logistic.awb.AwbService;

/**
 * @author Nitin
 *
 */
public class PlaceLogisticOrderActivity extends
		BaseActivity<ProcessContext<CheckoutSeed>> {

	@Resource(name = "blAwbService")
	protected AwbService awbService;

	@Resource(name = "blOrderService")
	protected OrderService orderService;

	public PlaceLogisticOrderActivity() {
		// no specific state to set here for the rollback handler; it's always
		// safe for it to run
		setAutomaticallyRegisterRollbackHandler(true);
	}

	@Override
	public ProcessContext<CheckoutSeed> execute(
			ProcessContext<CheckoutSeed> context) throws Exception {
		CheckoutSeed seed = context.getSeedData();
		Order order = seed.getOrder();
		boolean isDeliveryRequired = true;
		for (FulfillmentGroup FulfillmentGroup : order.getFulfillmentGroups()) {
			if (null != FulfillmentGroup.getType()
					&& FulfillmentGroup.getType().equals(
							FulfillmentType.PHYSICAL_PICKUP)) {
				isDeliveryRequired = false;
			}
		}
		if (isDeliveryRequired) {
			assignAwbNumbers(seed.getOrder());
		}
		return context;
	}

	private void assignAwbNumbers(Order order) throws PricingException {
		System.out.println("getting awb number");
		String type = "PPD";
		if (null != order.getPayments() && null != order.getPayments().get(0)
				&& null != order.getPayments().get(0).getType()
				&& order.getPayments().get(0).getType() == PaymentType.COD) {
			type = "COD";
		}
		OrderAttribute orderAttribute = new OrderAttributeImpl();
		orderAttribute.setName("deliveryType");
		orderAttribute.setValue(type);
		orderAttribute.setOrder(order);
		order.getOrderAttributes().put("deliveryType", orderAttribute);

		List<String> awbList = awbService.generate(
				order.getOrderItems().size(), type);
		System.out.println("got AWB list with length -> " + awbList.size());
		int index = 0;
		for (OrderItem item : order.getOrderItems()) {
			Map<String, OrderItemAttribute> attributeMap;
			if (null != item.getOrderItemAttributes()) {
				attributeMap = item.getOrderItemAttributes();
			} else {
				attributeMap = new HashMap<String, OrderItemAttribute>();
			}
			int idx = index++;
			OrderItemAttribute awbAttribute = new OrderItemAttributeImpl();
			awbAttribute.setName("awbNumber");
			awbAttribute.setValue(awbList.get(idx));
			awbAttribute.setOrderItem(item);
			attributeMap.put("awbNumber", awbAttribute);
			item.setOrderItemAttributes(attributeMap);
			placeDeliveryRequest(order, item);
		}

		// orderService.save(order, false);
	}

	private void placeDeliveryRequest(Order order, OrderItem item) {
		System.out.println("placing the delivery request with logistic");
		boolean status = awbService.placeOrder(order, item);
		System.out.println("logistic delivery requesst sttaus = " + status);
		if (!status) {
			throw BroadleafWebServicesException
					.build(Response.Status.INTERNAL_SERVER_ERROR
							.getStatusCode())
					.addMessage(
							BroadleafWebServicesException.CHECKOUT_PROCESSING_ERROR);
		}
	}

}