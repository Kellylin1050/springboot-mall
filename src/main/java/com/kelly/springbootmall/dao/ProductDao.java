package com.kelly.springbootmall.dao;

import com.kelly.springbootmall.dto.ProductRequest;
import com.kelly.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
