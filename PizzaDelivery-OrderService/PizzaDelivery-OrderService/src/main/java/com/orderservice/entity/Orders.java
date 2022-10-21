package com.orderservice.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderId;
	private Long customerId;
	private String pizzaName;
	private String pizzaCategory;
	private String pizzaSize;
	private Double orderPrice;
	private LocalDate orderDate;
	private String orderStatus;

}
