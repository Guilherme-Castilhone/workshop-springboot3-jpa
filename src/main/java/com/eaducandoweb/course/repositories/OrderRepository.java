package com.eaducandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eaducandoweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
