package com.example.mongodb_multilanguge_design.controller;

import com.example.mongodb_multilanguge_design.dao.ProductDao;
import com.example.mongodb_multilanguge_design.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("product")
public class ProductController {
    private final ProductService productService;
    @PostMapping
    public ProductDao createProduct(@RequestBody ProductDao productDao){
        return productService.createProduct(productDao);
    }

    @PutMapping
    public ProductDao updateProduct(@RequestHeader String productId, @RequestHeader String translateDetailsId ){
        return productService.updateProduct(productId,translateDetailsId);
    }
}
