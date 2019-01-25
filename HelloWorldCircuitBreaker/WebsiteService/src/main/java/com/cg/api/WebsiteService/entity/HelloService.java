package com.cg.api.WebsiteService.entity;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {

	private final RestTemplate restTemplate;

	public HelloService(RestTemplate rest) {
		this.restTemplate = rest;
	}

	@HystrixCommand(fallbackMethod = "reliable")
	public String readingString() {
		URI uri = URI.create("http://localhost:9090/hello");
		return this.restTemplate.getForObject(uri, String.class);
	}
	
	  public String reliable() { 
		  return "Service is Down!!!"; }
	 
}
