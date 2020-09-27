package com.example.recipebook.controller;


import com.example.recipebook.model.Recipe;
import com.example.recipebook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RecipeController {

    private RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Recipe> topRanked = recipeService.findTopRecipe();
        model.addAttribute("topRanked", topRanked);
        return "index";
    }


    @GetMapping("/all")
    public String all(Model model) {
        List<Recipe> all = recipeService.findAll();
        model.addAttribute("allOrCategory", all);
        return "recipies";
    }

    @PostMapping("/add")
    public String save(Recipe recipe) {
        recipeService.save(recipe);
        return "redirect:/";
    }
}
