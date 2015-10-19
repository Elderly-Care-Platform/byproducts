package com.beautifulyears.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class CorsFilter Set header to every request
 * 
 * @author Aspire Software Solutions
 */
public class CorsFilter implements Filter {

  /**
   * Default constructor.
   */
  public CorsFilter() {}

  /**
   * @see Filter#destroy()
   */
  public void destroy() {}

  /**
   * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain) Set header to every requests
   */
  public void doFilter(ServletRequest request, ServletResponse res, FilterChain chain)
      throws IOException, ServletException {
    HttpServletResponse response = (HttpServletResponse) res;
    response.setHeader("Access-Control-Allow-Origin", "*");
    response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
    response.setHeader("Access-Control-Max-Age", "3600");
    response.setHeader("Access-Control-Allow-Headers", "x-requested-with, Content-Type");
    // pass the request along the filter chain
    chain.doFilter(request, response);
  }

  /**
   * @see Filter#init(FilterConfig)
   */
  public void init(FilterConfig fConfig) throws ServletException {}

}
