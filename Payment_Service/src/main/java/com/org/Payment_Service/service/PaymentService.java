package com.org.Payment_Service.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.org.Payment_Service.entity.Payment;
import com.org.Payment_Service.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository paymentRepository;
	
	
	public Payment doPayment(Payment payment) {
		payment.setPaymentStatus(paymentProcessing()); 
		payment.setTransactionId(UUID.randomUUID().toString());
		return paymentRepository.save(payment);
	}
	
	//for association with order
	public String paymentProcessing() {
		return new Random().nextBoolean()?"Success":"false";
	}
}
