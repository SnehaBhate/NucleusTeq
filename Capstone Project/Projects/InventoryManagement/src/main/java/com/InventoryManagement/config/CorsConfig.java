package com.InventoryManagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
   
	 @Bean
	    public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurer() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/api/users/**")
	                        .allowedOrigins("http://localhost:3000") 
	                        .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")
	                        .allowedHeaders("*")
	                        .allowCredentials(true);
	            }
	        };
	    }
	 
	 @Bean
	    public WebMvcConfigurer corsConfigurer1() {
	        return new WebMvcConfigurer() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/api/product/**")
	                        .allowedOrigins("http://localhost:3000") 
	                        .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")
	                        .allowedHeaders("*")
	                        .allowCredentials(true);
	            }
	        };
	    }
}
