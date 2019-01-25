package com.cg.api.WebsiteService.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.api.WebsiteService.entity.HelloService;
@RestController
public class WebsiteResourcce {

	@Autowired 
	private HelloService helloService;
	
	 @RequestMapping("/hello")
	 public String helloWorld() {
		return helloService.readingString();
	 }
}
