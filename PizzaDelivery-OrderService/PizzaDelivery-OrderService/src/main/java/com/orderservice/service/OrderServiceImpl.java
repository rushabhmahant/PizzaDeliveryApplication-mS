package com.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderservice.entity.Orders;
import com.orderservice.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<Orders> getAllOrders() {
		return orderRepository.findAll();
	}

	@Override
	public Orders getOrderById(Long orderId) {
		return orderRepository.findByOrderId(orderId);
	}
	
	public List<Orders> getOrdersByCustomerId(Long customerId){
		return orderRepository.getOrdersByCustomerId(customerId);
	}

	@Override
	public Orders placeOrder(Orders order) {
		return orderRepository.save(order);
	}

	@Override
	public Orders updateStatus(Long orderId, String status) {
		Orders order = getOrderById(orderId);
		order.setOrderStatus(status);
		return orderRepository.save(order);
	}

}
