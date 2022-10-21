package com.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.customerservice.entity.Customer;
import com.customerservice.repository.CustomerRepository;
import com.customerservice.valueobject.Orders;
import com.customerservice.valueobject.ResponseTemplateVO;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll(); 
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public ResponseTemplateVO getCustomerWithOrders(Long customerId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Customer customer = customerRepository.findByCustomerId(customerId);
		List<Orders> orders = restTemplate.getForObject("http://localhost:9191/order/customer/" + customerId, List.class);
		vo.setCustomer(customer);
		vo.setOrders(orders);
		return vo;
	}

}
