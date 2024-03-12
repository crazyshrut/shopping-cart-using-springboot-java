package com.example.Product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product.dto.FakeStoreProductDto;
import com.example.Product.service.ProductService;

@RestController
public class ArticleController {

    @Autowired
    ProductService ps;

    @GetMapping("/articles/")
    public FakeStoreProductDto[] getAllArticles() {
        return ps.getAllProducts();
    }
}
