package com.example.demo.controller.product;

import com.example.demo.dto.payload.reponse.MessageRespone;
import com.example.demo.model.product.Product;
import com.example.demo.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/products")
public class ProductRestController {
    @Autowired
    private IProductService productService;

    @GetMapping("test")
    @Secured({"ROLE_USER"})
    public void getTest() {
        System.out.printf("tiến");
    }

    @GetMapping
    public ResponseEntity<Page<Product>> getAllProduct(@PageableDefault(value = 5) Pageable pageable) {
        Page<Product> productPage = productService.getAllProduct(pageable);
        if (productPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productPage, HttpStatus.OK);
    }
}
