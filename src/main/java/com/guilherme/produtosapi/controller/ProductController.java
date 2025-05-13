package com.guilherme.produtosapi.controller;

import com.guilherme.produtosapi.model.Product;
import com.guilherme.produtosapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        System.out.println("Product received: " + product);

        String id = UUID.randomUUID().toString();
        product.setId(id);

        productRepository.save(product);
        return product;
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable("id") String id) {
        return productRepository.findById(id).orElse(null);
    }
}
