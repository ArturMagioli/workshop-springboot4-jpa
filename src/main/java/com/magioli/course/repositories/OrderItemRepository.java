package com.magioli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magioli.course.entities.OrderItem;
import com.magioli.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
    
}
