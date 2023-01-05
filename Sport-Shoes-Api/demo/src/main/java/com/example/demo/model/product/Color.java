package com.example.demo.model.product;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(columnDefinition = "boolean default false")
    private boolean deleteStatus;

    @JsonBackReference
    @OneToMany(mappedBy = "color")
    private Set<ProductDetail> productDetails;
}
