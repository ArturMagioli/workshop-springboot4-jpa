package com.magioli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magioli.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
