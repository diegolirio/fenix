package com.fenix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fenix.interceptors.CORSInterceptor;

@Configuration
public class WebAppInitializer extends WebMvcConfigurerAdapter   {

	@Autowired
	private CORSInterceptor corsInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(corsInterceptor);
    }

}
