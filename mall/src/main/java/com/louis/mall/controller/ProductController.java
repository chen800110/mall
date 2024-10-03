package com.louis.mall.controller;

import com.louis.mall.model.Product;
import com.louis.mall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product>getProduct(@PathVariable Integer productId)
    {   Product product = productService.getProductById(productId);

        if(product != null){
            return ResponseEntity.status(200).body(product);
        }else {
            return ResponseEntity.status(404).build();

        }

    }
}
