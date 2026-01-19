package com.magioli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magioli.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
