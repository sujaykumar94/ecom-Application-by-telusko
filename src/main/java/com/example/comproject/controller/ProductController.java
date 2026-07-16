package com.example.comproject.controller;

import com.example.comproject.entity.Product;
import com.example.comproject.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        Product product = productService.getProductById(id);
            if (Objects.nonNull(product)) {
                return ResponseEntity.ok(product);
            }

        return ResponseEntity.notFound().build();
    }


    @PostMapping("/products")
    public Product addProducts(@RequestBody Product product) {
        return productService.addProduct(product);
    }


    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }


}
