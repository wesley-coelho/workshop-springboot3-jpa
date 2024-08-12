package com.wesleycoelho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesleycoelho.course.entities.OrderItem;
import com.wesleycoelho.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
