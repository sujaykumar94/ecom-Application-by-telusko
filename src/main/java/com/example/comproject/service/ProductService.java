package com.example.comproject.service;

import com.example.comproject.entity.Product;
import com.example.comproject.repo.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    @Cacheable(value = "productsCache", key = "'allProducts'")
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

        System.out.println("Inside getAllProducts method");

        return repo.findAll();

    }


    @CachePut(value = "productsCache", key = "#product.id")
    public Product addProduct(Product product) {
        System.out.println("Inside addProducts method");
        return repo.saveAndFlush(product);

    }


    @CacheEvict(value = "productsCache", key = "#id")
    public void deleteProduct(Integer id) {
        log.info("Deleting product with id: {}", id);
        repo.deleteById(id);
    }

    @Cacheable(value = "productsCache", key = "#id")
    public Product getProductById(int id) {
        log.info("Fetching product with id: {}", id);
        return repo.findById(id).orElse(Product.builder().id(-1).prodName("Not Found").build());
    }
}
