package com.example.recipebook.controller;


import com.example.recipebook.model.Recipe;
import com.example.recipebook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecipeController {

    RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/all")
    public String all() {
        recipeService.findAll();
        return "redirect:/";
    }

    @PostMapping("/add")
    public String save(Recipe recipe) {
        recipeService.save(recipe);
        return "redirect:/";
    }
}
