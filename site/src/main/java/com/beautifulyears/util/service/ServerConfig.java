package com.beautifulyears.util.service;

import javax.servlet.ServletContext;

import org.springframework.web.context.ServletContextAware;

public class ServerConfig implements ServletContextAware {
  private String serverRootUrl;

  public String getServerRootUrl() {
    return serverRootUrl;
  }

  public void setServletContext(ServletContext servletContext) {
    this.serverRootUrl = servletContext.getContextPath();
  }
}
