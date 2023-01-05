package com.example.demo.repository.product;

import com.example.demo.model.product.DisCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IDiscountRepository extends JpaRepository<DisCount,Integer> {
}
