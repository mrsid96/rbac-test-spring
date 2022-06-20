package com.sid.rbactest;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
@EnableGlobalMethodSecurity(
        prePostEnabled = true
)
@EnableWebSecurity(debug = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.sessionManagement().disable();
        http.cors().disable();
        http.csrf().disable();
        http.logout().disable();
        http.requestCache().disable();
        http.authorizeRequests().antMatchers("api/v1/employee/**").permitAll();
    }
}
