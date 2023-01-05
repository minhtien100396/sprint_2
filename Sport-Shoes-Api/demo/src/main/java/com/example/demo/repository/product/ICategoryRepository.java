package com.example.demo.repository.product;

import com.example.demo.model.product.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ICategoryRepository extends JpaRepository<Category,Integer> {
}
