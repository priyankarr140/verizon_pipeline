package com.example.catalog;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@GetMapping("/orders/{id}")
	 String getData(@PathVariable  int id)
	 {
		return id+"";
	 }
	@PostMapping("/api/consumer/customers/{customerid}/orders")
	List<Order> postOrder(@PathVariable int customerid,@RequestBody List<Order>data)
	{
		data.get(0).setOrderId(customerid);
		data.get(1).setOrderId(customerid);
		return data;
		//return true;
	}


}
