package com.customerservice.service;

import java.util.List;

import com.customerservice.entity.Customer;
import com.customerservice.valueobject.ResponseTemplateVO;

public interface CustomerService {
	
	public List<Customer> getAllCustomers();
	
	public Customer addCustomer(Customer customer);
	
	public ResponseTemplateVO getCustomerWithOrders(Long customerId);

}
