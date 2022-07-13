package com.app.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.course.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {

}