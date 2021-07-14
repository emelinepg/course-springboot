package com.devnoir.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnoir.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
