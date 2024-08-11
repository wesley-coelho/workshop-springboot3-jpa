package com.wesleycoelho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleycoelho.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
