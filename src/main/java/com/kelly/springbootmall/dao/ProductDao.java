package com.kelly.springbootmall.dao;

import com.kelly.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
