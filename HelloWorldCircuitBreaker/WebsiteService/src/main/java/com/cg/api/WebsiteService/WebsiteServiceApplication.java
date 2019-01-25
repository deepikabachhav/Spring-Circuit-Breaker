package com.cg.api.WebsiteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.cg.api.WebsiteService.entity.HelloService;
@EnableCircuitBreaker
@SpringBootApplication
public class WebsiteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteServiceApplication.class, args);
	}
	
	
	 @Bean
	  public RestTemplate rest(RestTemplateBuilder builder) {
	    return builder.build();
	  }
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

