package com.devnoir.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnoir.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
