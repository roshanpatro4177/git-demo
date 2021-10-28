package com.roshan.spring.jenkins.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContorller {
	
	@GetMapping("/hello")
	public String getName() {
		return "Hello World!!";
	}

}
