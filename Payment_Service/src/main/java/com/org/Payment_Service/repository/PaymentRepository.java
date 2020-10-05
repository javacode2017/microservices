package com.org.Payment_Service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.Payment_Service.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
