/**
 * 
 */
package com.beautifulyears.workflow;

import java.util.Map;

import org.broadleafcommerce.core.checkout.service.workflow.CheckoutSeed;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.domain.OrderItem;
import org.broadleafcommerce.core.workflow.Activity;
import org.broadleafcommerce.core.workflow.ProcessContext;
import org.broadleafcommerce.core.workflow.state.RollbackFailureException;
import org.broadleafcommerce.core.workflow.state.RollbackHandler;
import org.springframework.stereotype.Component;

/**
 * @author Nitin
 *
 */
@Component("blPlaceLogisticOrderRollbackHandler")
public class PlaceLogisticOrderRollbackHandler  implements RollbackHandler<CheckoutSeed> {

	@Override
	public void rollbackState(
			Activity<? extends ProcessContext<CheckoutSeed>> activity,
			ProcessContext<CheckoutSeed> processContext,
			Map<String, Object> stateConfiguration)
			throws RollbackFailureException {
		CheckoutSeed seed = processContext.getSeedData();
		Order order = seed.getOrder();
		order.getOrderAttributes().remove("deliveryType");
		for (OrderItem item : order.getOrderItems()) {
			item.setOrderItemAttributes(null);
		}
		
	}

}
