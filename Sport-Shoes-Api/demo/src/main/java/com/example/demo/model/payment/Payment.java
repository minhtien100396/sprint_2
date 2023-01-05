package com.example.demo.model.payment;

import com.example.demo.model.order.Oder;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "text")
    private String shippingDescription;
    @Column(columnDefinition = "boolean default false")
    private boolean deleteStatus;
    @Column(columnDefinition = "boolean default false")
    private boolean paymentStatus;
    @Column(columnDefinition = "date")
    private String paymentTime;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "oder_id",referencedColumnName = "id")
    private Oder oder;
}
