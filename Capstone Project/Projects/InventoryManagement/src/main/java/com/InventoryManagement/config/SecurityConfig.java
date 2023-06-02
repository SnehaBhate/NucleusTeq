package com.InventoryManagement.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

//import com.InventoryManagement.Services.impl.ProductServiceImpl;
//import com.InventoryManagement.Services.impl.ProductServiceImpl;
import com.InventoryManagement.Services.impl.UserDetailServiceImpl;

@Configuration
@EnableWebSecurity

public class SecurityConfig {
	@Autowired
    private UserDetailServiceImpl userDetailServiceImpl;
	//private ProductServiceImpl productServiceImpl;
	
	 
	  

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    	http.csrf().disable()
        .authorizeHttpRequests()
            .requestMatchers("/api/users/**","/api/product/**").permitAll()
           //.requestMatchers("/api/product").permitAll()
            .anyRequest().authenticated()
            .and()
            .httpBasic();
        return http.build();
    }
	 
	 
	 protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.userDetailsService(this.userDetailServiceImpl).passwordEncoder(passwordEncoder());
	    //    auth.ProductServiceImpl(this.productServiceImpl).passwordEncoder(passwordEncoder());
	    }
	 
	 
	 @Bean
	  public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	  }
	 
	
}
