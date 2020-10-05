package com.org.order_service.common;

import com.org.order_service.entity.Order;

public class TransactionRequest {
 private Order order;
 private Payment payment;
public Order getOrder() {
	return order;
}
public void setOrder(Order order) {
	this.order = order;
}
public Payment getPayment() {
	return payment;
}
public void setPayment(Payment payment) {
	this.payment = payment;
}
public TransactionRequest(Order order, Payment payment) {
	super();
	this.order = order;
	this.payment = payment;
}
public TransactionRequest() {
	super();
}
@Override
public String toString() {
	return "TransactionRequest [order=" + order + ", payment=" + payment + "]";
}
 
 
 
}
