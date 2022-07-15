package com.app.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.course.entities.OrderItem;
import com.app.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}