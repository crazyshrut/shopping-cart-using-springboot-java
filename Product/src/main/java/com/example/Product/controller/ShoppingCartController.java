package com.example.Product.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.Product.dto.FakeStoreProductDto;
import com.example.Product.service.ProductService;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ShoppingCartController {
    ProductService ps;

    ShoppingCartController(ProductService ps) {
        this.ps = ps;
    }

    @GetMapping("/products/")
    public FakeStoreProductDto[] getAllProducts() {
        return ps.getAllProducts();
    }

    @GetMapping("/products/{id}/")
    public FakeStoreProductDto getProductbyId(@PathVariable Long id) {

        return ps.getProductbyId(id);
    }
    
    
    @DeleteMapping("/products/")
    public String requestMethodName(@RequestParam String param) {
        return "deleted";
    }
    
   @PutMapping("/products/{id}/")
   public String putMethodName(@PathVariable String id, @RequestBody String entity) {

       return entity;
   }
}