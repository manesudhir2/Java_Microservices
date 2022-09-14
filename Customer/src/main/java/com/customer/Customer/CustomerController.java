package com.customer.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.Customer.Model.Customer;
import com.customer.Customer.Service.CustomerServiceImplementation;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
	
	@Autowired
	CustomerServiceImplementation csi;
	
	@GetMapping("/{id}")
	public Customer DemoMethod(@PathVariable("id") int id) {
		return csi.getCustomer(id);
	}
}
