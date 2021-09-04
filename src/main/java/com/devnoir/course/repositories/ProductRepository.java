package com.devnoir.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnoir.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
