package com.example.demo.model.user;

import com.example.demo.model.order.Oder;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String phone;
    private String email;
    private int point;
    private String address;
    private String birthDay;
    private String idCard;
    private String avatar;
    @Column(columnDefinition = "boolean default false")
    private boolean deleteStatus;

    @JsonBackReference
    @OneToMany(mappedBy = "user")
    private Set<Oder> oders;
}
