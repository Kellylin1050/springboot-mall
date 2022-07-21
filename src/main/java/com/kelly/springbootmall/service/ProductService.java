package com.kelly.springbootmall.service;

import com.kelly.springbootmall.dto.ProductQueryParams;
import com.kelly.springbootmall.dto.ProductRequest;
import com.kelly.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
