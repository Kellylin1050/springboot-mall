package com.kelly.springbootmall.service.impl;

import com.kelly.springbootmall.dao.ProductDao;
import com.kelly.springbootmall.model.Product;
import com.kelly.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}