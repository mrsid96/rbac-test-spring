package com.sid.rbactest;

import com.sid.rbactest.filters.SpecificURLPatternFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RbacTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RbacTestApplication.class, args);
	}

	@Bean
	FilterRegistrationBean<SpecificURLPatternFilter> specificURLPatternFilterFilterRegistrationBean(){
		final FilterRegistrationBean<SpecificURLPatternFilter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
		filterFilterRegistrationBean.setFilter(new SpecificURLPatternFilter());
		filterFilterRegistrationBean.addUrlPatterns("/lol/*");
		return filterFilterRegistrationBean;
	}
}
