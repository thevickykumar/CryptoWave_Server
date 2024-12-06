package com.example.Trading.service;

import com.example.Trading.domain.OrderType;
import com.example.Trading.model.Coin;
import com.example.Trading.model.Order;
import com.example.Trading.model.OrderItem;
import com.example.Trading.model.User;

import java.util.List;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId);

    List<Order> getAllOrdersForUser(Long userId, String orderType, String assetSymbol);

    void cancelOrder(Long orderId);


    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;
}
