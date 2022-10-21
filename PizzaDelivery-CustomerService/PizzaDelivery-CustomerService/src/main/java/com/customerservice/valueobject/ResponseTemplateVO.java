package com.customerservice.valueobject;

import java.util.List;

import com.customerservice.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
	
	private Customer customer;
	private List<Orders> orders;

}
