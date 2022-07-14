package com.app.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}