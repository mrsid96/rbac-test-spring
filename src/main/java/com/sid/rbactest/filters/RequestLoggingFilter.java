package com.sid.rbactest.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
@Order(1)
public class RequestLoggingFilter implements Filter {

    private static final Logger LOG = LoggerFactory.getLogger(RequestLoggingFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        LOG.info("In request logging filter");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
