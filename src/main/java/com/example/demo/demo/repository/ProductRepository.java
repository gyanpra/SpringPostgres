package com.example.demo.demo.repository;

import com.example.demo.demo.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {
}
