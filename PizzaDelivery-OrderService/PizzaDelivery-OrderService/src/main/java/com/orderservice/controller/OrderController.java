package com.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.entity.Orders;
import com.orderservice.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/getAllOrders")
	public List<Orders> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@GetMapping("/search")
	public List<Orders> searchOrder(){
		return orderService.getAllOrders();
	}
	
	@GetMapping("/{orderId}")
	public Orders getOrderById(@PathVariable Long orderId) {
		return orderService.getOrderById(orderId);
	}
	
	@GetMapping("/customer/{customerId}")
	public List<Orders> getOrdersByCustomerId(@PathVariable Long customerId){
		return orderService.getOrdersByCustomerId(customerId);
	}
	
	@PostMapping("/placeorder")
	public Orders placeOrder(@RequestBody Orders order) {
		return orderService.placeOrder(order);
	}
	
	@PutMapping("/{orderId}/updateorderstatus")
	public Orders updateOrderStatus(@PathVariable Long orderId, @RequestParam String status) {
		return orderService.updateStatus(orderId, status);
	}
	

}
