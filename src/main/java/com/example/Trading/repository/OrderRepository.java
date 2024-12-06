package com.example.Trading.repository;

import com.example.Trading.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {

    public List<Order> findByUserId(Long userId);
}
