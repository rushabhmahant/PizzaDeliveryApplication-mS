package com.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerservice.entity.Customer;
import com.customerservice.service.CustomerService;
import com.customerservice.valueobject.ResponseTemplateVO;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/{customerId}")
	public ResponseTemplateVO getByCustomerWithOrders(@PathVariable Long customerId) {
		return customerService.getCustomerWithOrders(customerId);
	}
	
	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}

}
