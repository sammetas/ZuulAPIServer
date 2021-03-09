package com.samm.ZuulAPIServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiServerApplication.class, args);
	}


	@Bean
	public ZuulLoggingFilter getZuulLoggingFilter(){
		return new ZuulLoggingFilter();
	}

}
