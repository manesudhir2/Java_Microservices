package com.customer.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.customer.Customer.Model.Contact;
import com.customer.Customer.Model.Customer;
import com.customer.Customer.Service.CustomerServiceImplementation;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
	
	@Autowired
	private CustomerServiceImplementation csi;
	
	@Autowired
	private RestTemplate resttemplate;
	
	@GetMapping("/{id}")
	public Customer DemoMethod(@PathVariable("id") int id) {
		
		Customer c = csi.getCustomer(id);
		
		List<Contact> contacts = resttemplate.getForObject("http://contact-service/Contact/"+id, List.class);
		
		c.setContact(contacts);
		
		return csi.getCustomer(id);
	}
}
