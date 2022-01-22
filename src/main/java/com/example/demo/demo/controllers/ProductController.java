package com.example.demo.demo.controllers;


import com.example.demo.demo.model.Products;
import com.example.demo.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Products> getUsers() {
        return productService.getProducts();
    }

    @PostMapping
    public Products saveUser(@RequestBody Products product) {
        return productService.saveProduct(product);
    }

    @PutMapping("/{id}")
    public Products updateProduct(@RequestBody Products product, @PathVariable("id") String id) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable("id") String id) {
        productService.deleteProduct(id);
        return "Product deleted succesfully.";
    }

}
