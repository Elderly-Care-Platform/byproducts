/**
 * 
 */
package com.beautifulyears.workflow;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.broadleafcommerce.common.currency.util.BroadleafCurrencyUtils;
import org.broadleafcommerce.common.money.Money;
import org.broadleafcommerce.core.catalog.service.CatalogService;
import org.broadleafcommerce.core.order.domain.DiscreteOrderItem;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.domain.OrderItem;
import org.broadleafcommerce.core.order.service.OrderService;
import org.broadleafcommerce.core.order.service.workflow.CartOperationRequest;
import org.broadleafcommerce.core.workflow.BaseActivity;
import org.broadleafcommerce.core.workflow.ProcessContext;

import com.beautifulyears.sample.catalog.domain.ExtendProductImpl;

/**
 * @author Nitin
 *
 */
public class UpdateDeliveryChargesActivity extends BaseActivity<ProcessContext<Order>> {

    private static final Log LOG = LogFactory.getLog(UpdateDeliveryChargesActivity.class);
    
    @Resource(name = "blCatalogService")
    protected CatalogService catalogService;
    
    @Resource(name = "blOrderService")
    protected OrderService orderService;
    
    
    @Override
    public ProcessContext<Order> execute(ProcessContext<Order> context) throws Exception {
    	Order order = context.getSeedData();
    	Money totalDeliveryCharges = BroadleafCurrencyUtils.getMoney(
				BigDecimal.ZERO, order.getCurrency());

		for (OrderItem orderItem : order.getOrderItems()) {
			if (orderItem instanceof DiscreteOrderItem) {
				ExtendProductImpl product = (ExtendProductImpl) ((DiscreteOrderItem) orderItem)
						.getProduct();
				Money deliveryCharges = BroadleafCurrencyUtils
						.getMoney(
								new BigDecimal(product
										.getProductDeliveryCharges()),
								order.getCurrency());
				totalDeliveryCharges = totalDeliveryCharges
						.add(deliveryCharges);
			}

		}
		order.setTotalFulfillmentCharges(totalDeliveryCharges);
//		order.setTotal(order.getSubTotal().add(totalDeliveryCharges));
        return context;
    }
    
}