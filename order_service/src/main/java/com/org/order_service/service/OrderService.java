package com.org.order_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.org.order_service.common.Payment;
import com.org.order_service.common.TransactionRequest;
import com.org.order_service.common.TransactionResponse;
import com.org.order_service.entity.Order;
import com.org.order_service.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public TransactionResponse saveOrder(TransactionRequest request) {
		String response= "";
		Order order = request.getOrder();
        Payment payment = request.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());
        
        Payment paymentResponse = restTemplate.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class);
		
        response = paymentResponse.getPaymentStatus().equals("success")?"payment success":"payment failure";
        
        orderRepository.save(order);	
		return new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTransactionId(),response);
	}

	
}
