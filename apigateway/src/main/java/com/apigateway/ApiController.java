package com.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	
	@GetMapping("/CustomerServiceFallback")
	public String customerServiceFallback() {
		return "Customer service is currently under maintainance, Please try later";
	}
	
	@GetMapping("/ContactServiceFallback")
	public String contactServiceFallback() {
		return "Contact service is currently under maintainance, Please try later";
	}
	
}
