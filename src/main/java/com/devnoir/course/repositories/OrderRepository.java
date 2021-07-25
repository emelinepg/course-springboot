package com.devnoir.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnoir.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
