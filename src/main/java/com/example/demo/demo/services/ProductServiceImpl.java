package com.example.demo.demo.services;


import com.example.demo.demo.model.Products;
import com.example.demo.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductRepository productRepository;

    @Override
    public Products saveProduct(Products product) {
        return productRepository.save(product);
    }

    @Override
    public List<Products> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Products updateProduct(String id, Products product) {
        Optional<Products> findById = productRepository.findById(Long.valueOf(String.valueOf(id)));
        if (findById.isPresent()) {
            Products productEntity = findById.get();
            if (product.getName() != null && !product.getName().isEmpty())
                productEntity.setName(product.getName());
            if (product.getDescription() != null)
                productEntity.setDescription(product.getDescription());
            return productRepository.save(productEntity);
        }
        return null;
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(Long.valueOf(id));
    }



}
