package com.example.demo.model.product;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "description", columnDefinition = "text")
    private String description;
    private Double price;
    @Column(columnDefinition = "date")
    private String dateSubmitted;
    @Column(columnDefinition = "boolean default false")
    private boolean deleteStatus;

    @ManyToOne
    @JoinColumn(name = "discount_id", referencedColumnName = "id")
    private DisCount disCount;

    @ManyToOne
    @JoinColumn(name = "brand_id", referencedColumnName = "id")
    private Brand brand;

    @OneToMany(mappedBy = "product")
    private Set<ProductDetail> productDetails;


}
