package com.kelly.springbootmall.service;

import com.kelly.springbootmall.dto.ProductRequest;
import com.kelly.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
