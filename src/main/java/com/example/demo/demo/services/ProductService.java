package com.example.demo.demo.services;

import com.example.demo.demo.model.Products;

import java.util.List;

public interface ProductService {
    public Products saveProduct(Products product);
    public List<Products> getProducts();
    public Products updateProduct(String id, Products product);
    public void deleteProduct(String id);
}
