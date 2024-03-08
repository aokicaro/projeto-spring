package com.aoki.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aoki.api.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}
