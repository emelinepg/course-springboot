package com.devnoir.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnoir.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
