package com.example.demo.service.product;

import com.example.demo.model.product.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<Product> getAllProduct(Pageable pageable);
}
