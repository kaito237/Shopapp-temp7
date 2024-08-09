package com.project.shopapp.controllers;

import com.project.shopapp.dtos.CategoryDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
    // hien thi categories
    @GetMapping("")
    public ResponseEntity<String> getAllCategories(
            @RequestParam("page")
            int page,
            @RequestParam("limit")
            int limit
    ) {
        return ResponseEntity.ok(String.format("getAllCAtegories, page = %d, limit = %d", page, limit));
    }
    @PostMapping("")
    // tham so la dataobject
    public ResponseEntity<String> insertCategory(
            @RequestBody
            CategoryDTO categoryDTO) {
        return ResponseEntity.ok("This is insertCategory");
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateCategories(
            @PathVariable
            Long id) {
        return ResponseEntity.ok("insertCategory with id = " +id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategories(
            @PathVariable
            Long id) {
        return ResponseEntity.ok("insertCategory with id = " +id);
    }
}
