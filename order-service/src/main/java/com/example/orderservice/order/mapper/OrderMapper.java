package com.example.orderservice.order.mapper;


import com.example.orderservice.core.BaseMapper;
import com.example.orderservice.order.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {


}
