package com.beautifulyears.api.wrapper;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.broadleafcommerce.common.money.Money;
import org.broadleafcommerce.common.payment.PaymentGatewayType;
import org.broadleafcommerce.common.payment.PaymentType;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.service.OrderService;
import org.broadleafcommerce.core.payment.domain.OrderPayment;
import org.broadleafcommerce.core.payment.domain.PaymentTransaction;
import org.broadleafcommerce.core.payment.service.OrderPaymentService;
import org.broadleafcommerce.core.web.api.wrapper.AddressWrapper;
import org.broadleafcommerce.core.web.api.wrapper.OrderPaymentWrapper;
import org.broadleafcommerce.core.web.api.wrapper.PaymentTransactionWrapper;
import org.springframework.context.ApplicationContext;

/**
 * Extend Order payment wrapper to override existing wrapper
 * 
 * @author Aspire Software Solutions
 *
 */
@XmlRootElement(name = "payment")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class ExtendOrderPaymentWrapper extends OrderPaymentWrapper {

  @XmlElement
  protected ExtendAddressWrapper billingAddress;

  /*
   * Extend wrap details method to add extended entities in existing wrapper
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.OrderPaymentWrapper#wrapDetails
   * (org.broadleafcommerce.core.payment.domain.OrderPayment, javax.servlet.http.HttpServletRequest)
   */
  @Override
  public void wrapDetails(OrderPayment model, HttpServletRequest request) {
    this.id = model.getId();

    if (model.getOrder() != null) {
      this.orderId = model.getOrder().getId();
    }

    if (model.getType() != null) {
      this.type = model.getType().getType();
    }

    if (model.getGatewayType() != null) {
      this.gatewayType = model.getGatewayType().getType();
    }

    if (model.getBillingAddress() != null) {
      ExtendAddressWrapper addressWrapper =
          (ExtendAddressWrapper) context.getBean(AddressWrapper.class.getName());
      addressWrapper.wrapDetails(model.getBillingAddress(), request);
      this.billingAddress = addressWrapper;
    }

    if (model.getAmount() != null) {
      this.amount = model.getAmount().getAmount();
      this.currency = model.getAmount().getCurrency();
    }

    if (model.getTransactions() != null && !model.getTransactions().isEmpty()) {
      this.transactions = new ArrayList<PaymentTransactionWrapper>();
      for (PaymentTransaction transaction : model.getTransactions()) {
        PaymentTransactionWrapper transactionWrapper =
            (PaymentTransactionWrapper) context.getBean(PaymentTransactionWrapper.class.getName());
        transactionWrapper.wrapSummary(transaction, request);
        this.transactions.add(transactionWrapper);
      }
    }

    this.referenceNumber = model.getReferenceNumber();
  }

  @Override
  public void wrapSummary(OrderPayment model, HttpServletRequest request) {
    wrapDetails(model, request);
  }

  /*
   * Extend unwrap method to unwrap json
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.OrderPaymentWrapper#unwrap
   * (javax.servlet.http.HttpServletRequest, org.springframework.context.ApplicationContext)
   */
  @Override
  public OrderPayment unwrap(HttpServletRequest request, ApplicationContext context) {
    OrderPaymentService orderPaymentService =
        (OrderPaymentService) context.getBean("blOrderPaymentService");
    OrderPayment payment = orderPaymentService.create();

    OrderService orderService = (OrderService) context.getBean("blOrderService");
    Order order = orderService.findOrderById(this.orderId);
    if (order != null) {
      payment.setOrder(order);
    }

    payment.setId(this.id);
    payment.setType(PaymentType.getInstance(this.type));
    payment.setPaymentGatewayType(PaymentGatewayType.getInstance(this.gatewayType));
    payment.setReferenceNumber(this.referenceNumber);

    if (this.billingAddress != null) {
      payment.setBillingAddress(this.billingAddress.unwrap(request, context));
    }

    if (this.amount != null) {
      if (this.currency != null) {
        payment.setAmount(new Money(this.amount, this.currency));
      } else {
        payment.setAmount(new Money(this.amount));
      }
    }

    if (this.transactions != null && !this.transactions.isEmpty()) {
      for (PaymentTransactionWrapper transactionWrapper : this.transactions) {
        PaymentTransaction transaction = transactionWrapper.unwrap(request, context);
        transaction.setOrderPayment(payment);
        payment.addTransaction(transaction);
      }
    }

    return payment;
  }
}
