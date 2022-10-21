package com.customerservice.valueobject;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
	
	private Long orderId;
	private Long customerId;
	private String pizzaName;
	private String pizzaCategory;
	private String pizzaSize;
	private Double orderPrice;
	private LocalDate orderDate;
	private String orderStatus;

}
