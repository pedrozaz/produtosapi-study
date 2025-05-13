package com.guilherme.produtosapi.controller;

import com.guilherme.produtosapi.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @PostMapping
    public Product save(@RequestBody Product product) {
        System.out.println("Product received: " + product);
        return product;
    }
}
