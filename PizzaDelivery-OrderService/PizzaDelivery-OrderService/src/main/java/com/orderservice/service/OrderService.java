package com.orderservice.service;

import java.util.List;

import com.orderservice.entity.Orders;

public interface OrderService {
	
	public List<Orders> getAllOrders();
	
	public Orders getOrderById(Long orderId);
	
	public List<Orders> getOrdersByCustomerId(Long customerId);
	
	public Orders placeOrder(Orders order);

	public Orders updateStatus(Long orderId, String status);

}
