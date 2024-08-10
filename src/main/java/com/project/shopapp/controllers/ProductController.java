package com.project.shopapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/categories")
public class ProductController {
    @GetMapping("")
    public ResponseEntity<String> getProducts(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit) {
        return ResponseEntity.ok("getProducts here");
    }
    @GetMapping("/{id}")
    public ResponseEntity<String> getProducById(
            @PathVariable("id")
            String productId
    ) { return  ResponseEntity.ok("product with id:" + productId);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(
            @PathVariable long id) {
        return ResponseEntity.status()
    }
    )
}
