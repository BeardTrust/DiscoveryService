package com.beardtrust.webapp.discoveryservice.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * The Security configuration for the Discovery service.
 *
 * @author Matthew Crowell <Matthew.Crowell@Smoothstack.com>
 */
@Configuration
@EnableWebSecurity(debug = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	private final Environment environment;

	/**
	 * Instantiates a new Security config.
	 *
	 * @param environment the environment
	 */
	@Autowired
	public SecurityConfig(Environment environment) {
		this.environment = environment;
	}


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().anyRequest().permitAll();
		http.headers().frameOptions().disable();
	}
}
