package com.acc.dockerspringmysql.controller;

import com.acc.dockerspringmysql.model.Order;
import com.acc.dockerspringmysql.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    /*Swagger url
    *http://localhost:8080/swagger-ui/index.html
    */
    @Autowired
    private OrderService orderService;

    @PostMapping("/addOrder")
    private Order addOrder(Order order){
        return orderService.addOrder(order);
    }

    @GetMapping("/orderDetails")
    private List<Order> orderDetails(){
        return orderService.getOrders();
    }
}
