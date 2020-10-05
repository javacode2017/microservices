package com.org.order_service.common;

import com.org.order_service.entity.Order;

public class TransactionResponse {
	private Order order;
	private double amount;
	private String transactionId;
	private String message;
	
	
	
	 
	 
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public TransactionResponse(Order order, double amount, String transactionId, String message) {
		super();
		this.order = order;
		this.amount = amount;
		this.transactionId = transactionId;
		this.message = message;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public TransactionResponse(Order order, String transactionId, double amount) {
		super();
		this.order = order;
		this.transactionId = transactionId;
		this.amount = amount;
	}
	public TransactionResponse() {
		super();
	}
	@Override
	public String toString() {
		return "TransactionResponse [order=" + order + ", amount=" + amount + ", transactionId=" + transactionId
				+ ", message=" + message + "]";
	}
	 
	 
	
}
