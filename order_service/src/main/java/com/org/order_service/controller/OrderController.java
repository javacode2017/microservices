package com.org.order_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.order_service.common.Payment;
import com.org.order_service.common.TransactionRequest;
import com.org.order_service.common.TransactionResponse;
import com.org.order_service.entity.Order;
import com.org.order_service.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService  orderService;
	
	@PostMapping("/bookorder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest transactionRequest) {
		Order order = transactionRequest.getOrder();
		Payment payment = transactionRequest.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
		return orderService.saveOrder(transactionRequest);
	}
}
