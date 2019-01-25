package com.cg.apigateway.HelloWorldService.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}

}
