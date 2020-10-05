package com.org.order_service.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ORDER_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
@Id	
private int id;
private String name;
private int qty;
private double price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Order(int id, String name, int qty, double price) {
	super();
	this.id = id;
	this.name = name;
	this.qty = qty;
	this.price = price;
}
@Override
public String toString() {
	return "Order [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
}
public Order() {
	super();
}


}
