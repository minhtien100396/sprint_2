package com.example.demo.controller.product;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/products")
public class ProductRestController {

    @GetMapping("test")
    @Secured({"ROLE_USER"})
    public void getTest(){
        System.out.printf("tiến");
    }
}
