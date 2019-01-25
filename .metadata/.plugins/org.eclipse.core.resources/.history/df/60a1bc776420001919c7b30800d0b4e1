package com.cg.api.WebsiteService.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class WebsiteResourcce {


	 @Autowired
	 private RestTemplate restTmplate;
	 
	 @RequestMapping("/hello")
	 public String helloWorld() {
		String world= restTmplate.getForObject("http://localhost:8989/Helloworld",String.class);
		return world;
	 }
}
