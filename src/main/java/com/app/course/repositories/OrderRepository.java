package com.app.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}