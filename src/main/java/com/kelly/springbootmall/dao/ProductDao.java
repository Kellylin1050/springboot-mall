package com.kelly.springbootmall.dao;

import com.kelly.springbootmall.constant.ProductCategory;
import com.kelly.springbootmall.dto.ProductRequest;
import com.kelly.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
