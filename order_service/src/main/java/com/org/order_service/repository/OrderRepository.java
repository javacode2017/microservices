package com.org.order_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.order_service.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
