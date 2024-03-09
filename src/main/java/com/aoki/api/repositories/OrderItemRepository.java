package com.aoki.api.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.aoki.api.entities.OrderItem;
import com.aoki.api.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {}
