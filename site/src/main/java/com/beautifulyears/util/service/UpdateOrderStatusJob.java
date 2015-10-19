package com.beautifulyears.util.service;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Cron job for updating staus of the order
 * 
 * @author Aspire Software Solutions
 *
 */
public class UpdateOrderStatusJob extends QuartzJobBean {

  private UpdateOrderStatusService updateOrderStatusService;

  public void setUpdateOrderStatusService(UpdateOrderStatusService updateOrderStatusService) {
    this.updateOrderStatusService = updateOrderStatusService;
  }

  @Override
  protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
    System.out.println("**********cron job");
    updateOrderStatusService.updateOrderStatus();
  }
}
