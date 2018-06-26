package com.example.orderservice.order.web;

import com.example.orderservice.order.pojo.Order;
import com.example.orderservice.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 对外提供用户相关API接口
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private OrderService orderService;


    /**
     * 根据用户ID查询用户订单列表
     *
     * @param id
     */
    @GetMapping("/getOrderList")
    public List<Order> findInfoById(Long userId) {
        return orderService.getOrdersByUserId(userId);
    }


}
