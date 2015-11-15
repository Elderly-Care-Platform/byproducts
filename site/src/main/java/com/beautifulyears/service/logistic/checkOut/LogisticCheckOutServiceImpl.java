/**
 * 
 */
package com.beautifulyears.service.logistic.checkOut;

import java.util.List;

import javax.annotation.Resource;

import org.broadleafcommerce.common.payment.PaymentType;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.domain.OrderItem;

import com.beautifulyears.service.logistic.awb.AwbService;

/**
 * @author Nitin
 *
 */
public class LogisticCheckOutServiceImpl implements LogisticCheckOutService {

	@Resource(name = "blAwbService")
	protected AwbService awbService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.beautifulyears.service.logistic.checkOut.LogisticCheckOutService#
	 * checkOut(org.broadleafcommerce.core.order.domain.Order)
	 */
	@Override
	public Order checkOut(Order order) {
		String type = "PPD";
		if (null != order.getPayments() && null != order.getPayments().get(0)
				&& null != order.getPayments().get(0).getType()
				&& order.getPayments().get(0).getType() == PaymentType.COD) {
			type = "COD";
		}

		List<String> awbList = awbService.generate(order.getOrderItems().size(), type);
		for (OrderItem item : order.getOrderItems()) {
			
		}
		return null;
	}
}
