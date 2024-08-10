package com.project.shopapp.controllers;

import com.project.shopapp.dtos.CategoryDTO;
import jakarta.validation.Valid;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
    // hien thi categories
    @GetMapping("/list")
    public ResponseEntity<String> getAllCategories(@RequestParam("page") int page, @RequestParam("limit") int limit) {// page=10&...      /gtri
        return ResponseEntity.ok(String.format("getAllCAtegories, page = %d, limit = %d", page, limit));
    }
    @PostMapping("")
    // tham so la dataobject
    public ResponseEntity<?> insertCategory(
            @Valid
            @RequestBody
            CategoryDTO categoryDTO,
            BindingResult result) {
        if (result.hasErrors()) {
            List<String> errorMessages = result.getFieldErrors()
                    .stream()
                    .map(FieldError::getDefaultMessage)
                    .toList();
            return  ResponseEntity.badRequest().body(errorMessages);
        }
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
