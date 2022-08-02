package com.kelly.springbootmall.service;

import com.kelly.springbootmall.dto.CreateOrderRequest;
import com.kelly.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
