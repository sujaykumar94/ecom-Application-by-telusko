package com.example.comproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ecom_products")
public class Product implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq_generator")
    @SequenceGenerator(
            name = "product_seq_generator",
            sequenceName = "product_seq",
            allocationSize = 1
    )
    private int id;
    private String prodName;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    private LocalDate releaseDate;
    private boolean available;
    private int quantity;

    private String imageName;
    private String imageType;

    @Lob
    private byte[] imageData;


}
