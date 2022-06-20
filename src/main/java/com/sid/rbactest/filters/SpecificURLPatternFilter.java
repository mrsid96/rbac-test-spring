package com.sid.rbactest.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class SpecificURLPatternFilter implements Filter {

    private static final Logger LOG = LoggerFactory.getLogger(SpecificURLPatternFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        LOG.info("In SpecificURLPatternFilter filter");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
