package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    private IProductRepository iProductRepository;
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
       return iProductRepository.save(product);
    }

    @GetMapping("/getProducts")
    public List<Product> getAll(){
        return iProductRepository.findAll();
    }
}
