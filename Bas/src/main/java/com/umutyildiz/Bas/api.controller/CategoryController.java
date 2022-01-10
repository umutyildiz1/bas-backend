package com.umutyildiz.Bas.api.controller;

import com.umutyildiz.Bas.business.abstracts.CategoryService;
import com.umutyildiz.Bas.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("createCategory")
    public void createCategory(@RequestBody Category category){
        categoryService.createCategory(category);
    }
}
