package com.example.demo.model.product;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(columnDefinition = "boolean default false")
    private boolean deleteStatus;

    @JsonBackReference
    @OneToMany(mappedBy = "brand")
    private Set<Product> products;
}
