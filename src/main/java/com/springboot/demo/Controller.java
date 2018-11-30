package com.springboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	
	@GetMapping(value="health")
	public String healthCheck() {
		return "Health is OK. 2nd change";
		
		
	}

}
