package com.org.Payment_Service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "PAYMENT_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentId;
	private String paymentStatus;
	private String transactionId;
	
	
	// added to perform association, to know payment related to which order
	
	private int orderId;
	private double amount;
	
	
	
	
	public Payment(int paymentId, String paymentStatus, String transactionId, int orderId, double amount) {
		super();
		this.paymentId = paymentId;
		this.paymentStatus = paymentStatus;
		this.transactionId = transactionId;
		this.orderId = orderId;
		this.amount = amount;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public Payment(int paymentId, String paymentStatus, String transactionId) {
		super();
		this.paymentId = paymentId;
		this.paymentStatus = paymentStatus;
		this.transactionId = transactionId;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentStatus=" + paymentStatus + ", transactionId="
				+ transactionId + ", orderId=" + orderId + ", amount=" + amount + "]";
	}
	public Payment() {
		super();
	}
	
	

}
