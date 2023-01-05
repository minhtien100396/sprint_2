package com.example.demo.model.product;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class DisCount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "description", columnDefinition = "text")
    private String description;
    @Column(columnDefinition = "date")
    private String startTime;
    @Column(columnDefinition = "date")
    private String endTime;
    @Column(name = "percent")
    private Integer percent;
    @Column(columnDefinition = "boolean default false")
    private boolean deleteStatus;

    @JsonBackReference
    @OneToMany(mappedBy = "disCount")
    private Set<Product> products;
}
