package com.example.orderservice.order.service;

import com.example.orderservice.order.mapper.OrderMapper;
import com.example.orderservice.order.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public List<Order> getOrdersByUserId(Long userId) {
        Order order = new Order().setUserId(userId);
        List<Order> orders = orderMapper.select(order);
        return orders;
    }
}
