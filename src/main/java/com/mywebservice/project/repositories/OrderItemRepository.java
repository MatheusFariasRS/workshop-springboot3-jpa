package com.mywebservice.project.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mywebservice.project.entities.OrderItem;
import com.mywebservice.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

	

}
