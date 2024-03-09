package com.aoki.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aoki.api.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
