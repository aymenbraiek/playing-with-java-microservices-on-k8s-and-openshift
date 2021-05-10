package com.targa.labs.dev.myboutique.OrderService.repository;

import com.targa.labs.dev.myboutique.OrderService.domain.Payment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
