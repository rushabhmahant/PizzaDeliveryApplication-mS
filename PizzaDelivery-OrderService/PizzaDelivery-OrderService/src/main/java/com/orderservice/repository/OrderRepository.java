package com.orderservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.orderservice.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {

	public Orders findByOrderId(Long orderId);

	@Query("SELECT o from Orders o where o.customerId=:customerId")
	public List<Orders> getOrdersByCustomerId(Long customerId);
	
}
