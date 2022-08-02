package com.kelly.springbootmall.service;

import com.kelly.springbootmall.dto.CreateOrderRequest;
import com.kelly.springbootmall.dto.OrderQueryParams;
import com.kelly.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
