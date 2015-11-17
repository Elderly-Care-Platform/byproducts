/**
 * 
 */
package com.beautifulyears.service.logistic.checkOut;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.annotation.Resource;
import javax.ws.rs.core.Response;

import org.broadleafcommerce.common.payment.PaymentType;
import org.broadleafcommerce.core.checkout.service.exception.CheckoutException;
import org.broadleafcommerce.core.checkout.service.workflow.CheckoutResponse;
import org.broadleafcommerce.core.checkout.service.workflow.CheckoutSeed;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.domain.OrderAttribute;
import org.broadleafcommerce.core.order.domain.OrderAttributeImpl;
import org.broadleafcommerce.core.order.domain.OrderItem;
import org.broadleafcommerce.core.order.domain.OrderItemAttribute;
import org.broadleafcommerce.core.order.domain.OrderItemAttributeImpl;
import org.broadleafcommerce.core.order.service.OrderService;
import org.broadleafcommerce.core.order.service.type.OrderStatus;
import org.broadleafcommerce.core.pricing.service.exception.PricingException;
import org.broadleafcommerce.core.web.api.BroadleafWebServicesException;
import org.springframework.stereotype.Service;

import com.beautifulyears.service.logistic.awb.AwbService;

/**
 * @author Nitin
 *
 */
@Service("blLogisticCheckoutService")
public class LogisticCheckOutServiceImpl implements LogisticCheckOutService {

	@Resource(name = "blAwbService")
	protected AwbService awbService;

	@Resource(name = "blOrderService")
	protected OrderService orderService;

	/**
	 * Map of locks for given order ids. This lock map ensures that only a
	 * single request can handle a particular order at a time
	 */
	protected static ConcurrentMap<Long, Object> lockMap = new ConcurrentHashMap<Long, Object>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.beautifulyears.service.logistic.checkOut.LogisticCheckOutService#
	 * checkOut(org.broadleafcommerce.core.order.domain.Order)
	 */
	@Override
	public CheckoutResponse checkOut(Order order) throws PricingException,
			CheckoutException {

		// Immediately fail if another thread is currently attempting to check
		// out the order
		Object lockObject = putLock(order.getId());
		if (lockObject != null) {
			throw new CheckoutException(
					"This order is already in the process of being submitted, unable to checkout order -- id: "
							+ order.getId(), new CheckoutSeed(order,
							new HashMap<String, Object>()));
		}

		// Immediately fail if this order has already been checked out
		// previously
		if (!hasOrderBeenCompleted(order)) {
			throw new CheckoutException(
					"This order is not submitted yet, unable to checkout order -- id: "
							+ order.getId(), new CheckoutSeed(order,
							new HashMap<String, Object>()));
		}

		CheckoutSeed seed = null;
		try {
			// Do a final save of the order before going through with the
			// checkout workflow

			assignAwbNumbers(order);
			seed = new CheckoutSeed(order, new HashMap<String, Object>());

			seed.setOrder(order);

			return seed;
		} catch (Exception e) {
			throw new CheckoutException("Unable to checkout order -- id: "
					+ order.getId(), e.getCause(), seed);
		} finally {
			// The order has completed processing, remove the order from the
			// processing map
			removeLock(order.getId());
		}

	}

	private void assignAwbNumbers(Order order) throws PricingException {
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
		int index = 0;
		for (OrderItem item : order.getOrderItems()) {
			Map<String, OrderItemAttribute> attributeMap;
			if (null != item.getOrderItemAttributes()) {
				attributeMap = item.getOrderItemAttributes();
			} else {
				attributeMap = new HashMap<String, OrderItemAttribute>();
			}
			OrderItemAttribute awbAttribute = new OrderItemAttributeImpl();
			awbAttribute.setName("awbNumber");
			awbAttribute.setValue(awbList.get(index++));
			awbAttribute.setOrderItem(item);
			attributeMap.put("awbNumber", awbAttribute);
			item.setOrderItemAttributes(attributeMap);
			placeDeliveryRequest(order, item);
		}

		orderService.save(order, false);
	}

	private void placeDeliveryRequest(Order order, OrderItem item) {
		boolean status = awbService.placeOrder(order, item);
		if (!status) {
			throw BroadleafWebServicesException
					.build(Response.Status.INTERNAL_SERVER_ERROR
							.getStatusCode())
					.addMessage(
							BroadleafWebServicesException.CHECKOUT_PROCESSING_ERROR);
		}
	}

	/**
	 * Checks if the <b>order</b> has already been gone through the checkout
	 * workflow.
	 * 
	 * @param order
	 * @return
	 */
	protected boolean hasOrderBeenCompleted(Order order) {
		return OrderStatus.SUBMITTED.equals(order.getStatus());
	}

	/**
	 * Get an object to lock on for the given order id
	 * 
	 * @param orderId
	 * @return null if there was not already a lock object available. If an
	 *         object was already in the map, this will return that object,
	 *         which means that there is already a thread attempting to go
	 *         through the checkout workflow
	 */
	protected Object putLock(Long orderId) {
		return lockMap.putIfAbsent(orderId, new Object());
	}

	/**
	 * Done with processing the given orderId, remove the lock from the map
	 * 
	 * @param orderId
	 */
	protected void removeLock(Long orderId) {
		lockMap.remove(orderId);
	}

}
