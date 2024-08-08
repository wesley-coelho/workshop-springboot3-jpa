package com.wesleycoelho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleycoelho.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
