package com.acc.dockerspringmysql.service;

import com.acc.dockerspringmysql.model.Order;

import java.util.List;

public interface OrderService {
    Order addOrder(Order order);
    List<Order> getOrders();

}
