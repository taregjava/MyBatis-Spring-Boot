package com.halfacode.mybatis.service;


import com.halfacode.mybatis.mapper.ProductMapper;
import com.halfacode.mybatis.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductMapper productMapper;

    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public List<Product> getAllProducts() {
        return productMapper.findAll();
    }

    public Product getProductById(Long id) {
        return productMapper.findById(id);
    }

    public void addProduct(Product product) {
        productMapper.insert(product);
    }

    public void updateProduct(Product product) {
        productMapper.update(product);
    }

    public void deleteProduct(Long id) {
        productMapper.delete(id);
    }
}