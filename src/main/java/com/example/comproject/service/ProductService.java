package com.example.comproject.service;

import com.example.comproject.entity.Product;
import com.example.comproject.repo.ProductRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAllProducts() {
        /*List<Product> productList = new ArrayList<>();
        for(int i=0;i<10;i++) {
            Product product = new Product();
            product.setProdName("Product " + (i + 1));
            product.setPrice(BigDecimal.valueOf((i + 1) * 10));
            product.setCategory("Cars");
            product.setAvailable(true);
            product.setQuantity(100);
            product.setReleaseDate(LocalDate.now());
            productList.add(product);

        }
        repo.saveAllAndFlush(productList);*/

        return repo.findAll();

    }
}
