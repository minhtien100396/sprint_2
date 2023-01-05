package com.example.demo.model.order;

import com.example.demo.model.payment.Payment;
import com.example.demo.model.product.ProductDetail;
import com.example.demo.model.user.User;

import javax.persistence.*;

@Entity
public class Oder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "date")
    private String orderTime;
    @Column(columnDefinition = "boolean default false")
    private boolean deleteStatus;

    @ManyToOne
    @JoinColumn(name = "product_detail_id", referencedColumnName = "id")
    private ProductDetail productDetail;

    @OneToOne(mappedBy = "oder")
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
