package com.customer.Customer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
	
	@RequestMapping("/Demo")
	public String DemoMethod() {
		return "Customer is working";
	}
}
