package com.beautifulyears.service.email;

import java.io.IOException;
import java.util.HashMap;

import javax.annotation.Resource;

import org.broadleafcommerce.common.email.service.EmailService;
import org.broadleafcommerce.common.email.service.info.EmailInfo;
import org.broadleafcommerce.core.order.domain.Order;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo;

/**
 * This service is used to send mail for order confirmation and order cancellation
 * 
 * @author Aspire Software Solutions
 *
 */
@Service("extendEmailService")
public class ExtendEmailServiceImpl implements ApplicationContextAware, ExtendEmailService {

  @Resource(name = "blEmailService")
  protected EmailService emailService;

  protected ApplicationContext applicationContext;

  /*
   * Above method is used to send mail on order confirmation
   * 
   * (non-Javadoc)
   * 
   * @see
   * com.beautifulyears.service.email.ExtendEmailService#sendOrderConfirmation(org.broadleafcommerce
   * .core.order.domain.Order, com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo,
   * java.lang.String)
   */
  @Override
  public void sendOrderConfirmation(Order order, OrderTrackingInfo orderTrackingInfo,
      String emailAddress) throws IOException {
    HashMap<String, Object> props = new HashMap<String, Object>();
    props.put("order", order);
    props.put("orderTrackingInfo", orderTrackingInfo);
    emailService.sendTemplateEmail(emailAddress, getOrderConfirmationEmailInfo(), props);
  }

  /*
   * Above method is used to send mail on order confirmation to admin
   * 
   * (non-Javadoc)
   * 
   * @see com.beautifulyears.service.email.ExtendEmailService#sendOrderConfirmationAdmin(org.
   * broadleafcommerce.core.order.domain.Order,
   * com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo, java.lang.String)
   */
  @Override
  public void sendOrderConfirmationAdmin(Order order, OrderTrackingInfo orderTrackingInfo,
      String emailAddress) throws IOException {
    HashMap<String, Object> props = new HashMap<String, Object>();
    props.put("order", order);
    props.put("orderTrackingInfo", orderTrackingInfo);
    emailService.sendTemplateEmail(emailAddress, getOrderConfirmationAdminEmailInfo(), props);
  }

  /*
   * Above method is used to send mail on order cancellation
   * 
   * (non-Javadoc)
   * 
   * @see
   * com.beautifulyears.service.email.ExtendEmailService#sendOrderCancellation(org.broadleafcommerce
   * .core.order.domain.Order, java.lang.String)
   */
  @Override
  public void sendOrderCancellation(Order order, String emailAddress) throws IOException {
    HashMap<String, Object> props = new HashMap<String, Object>();
    props.put("order", order);
    emailService.sendTemplateEmail(emailAddress, getOrderCancellationEmailInfo(), props);
  }

  /*
   * Above method is used to send mail on order cancellation for admin (non-Javadoc)
   * 
   * @see com.beautifulyears.service.email.ExtendEmailService#sendOrderCancellationAdmin(org.
   * broadleafcommerce.core.order.domain.Order, java.lang.String)
   */
  @Override
  public void sendOrderCancellationAdmin(Order order, String emailAddress) throws IOException {
    HashMap<String, Object> props = new HashMap<String, Object>();
    props.put("order", order);
    emailService.sendTemplateEmail(emailAddress, getOrderCancellationAdminEmailInfo(), props);
  }

  /*
   * Send mail for requesting feedback
   * 
   * (non-Javadoc)
   * 
   * @see
   * com.beautifulyears.service.email.ExtendEmailService#sendFeedback(org.broadleafcommerce.core
   * .order.domain.Order, java.lang.String)
   */
  @Override
  public void sendFeedback(Order order, String emailAddress) throws IOException {
    HashMap<String, Object> props = new HashMap<String, Object>();
    props.put("order", order);
    emailService.sendTemplateEmail(emailAddress, getFeedbackEmailInfo(), props);
  }

  private EmailInfo getFeedbackEmailInfo() {
    return (EmailInfo) applicationContext.getBean("blFeedback");
  }

  /**
   * Above method is used to get bean for order cancellation, the bean set properties for sending
   * mail, Method based injection because we need to reference prototype scoped beans in a singleton
   * bean
   * 
   * @return
   */
  private EmailInfo getOrderCancellationEmailInfo() {
    return (EmailInfo) applicationContext.getBean("blOrderCancellationEmailInfo");
  }

  /**
   * Above method is used to get bean for order cancellation, the bean set properties for sending
   * mail, Method based injection because we need to reference prototype scoped beans in a singleton
   * bean
   * 
   * @return
   */
  private EmailInfo getOrderCancellationAdminEmailInfo() {
    return (EmailInfo) applicationContext.getBean("blOrderCancellationAdminEmailInfo");
  }

  /**
   * Above method is used to get bean for order confirmation, the bean set properties for sending
   * mail, Method based injection because we need to reference prototype scoped beans in a singleton
   * bean
   * 
   * @return
   */
  protected EmailInfo getOrderConfirmationEmailInfo() {
    return (EmailInfo) applicationContext.getBean("blOrderConfirmationEmailInfo");
  }

  /**
   * Above method is used to get bean for order confirmation, the bean set properties for sending
   * mail, Method based injection because we need to reference prototype scoped beans in a singleton
   * bean
   * 
   * @return
   */
  private EmailInfo getOrderConfirmationAdminEmailInfo() {
    return (EmailInfo) applicationContext.getBean("blOrderConfirmationAdminEmailInfo");
  }

  /*
   * Set application context
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework
   * .context.ApplicationContext)
   */
  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
  }
}
