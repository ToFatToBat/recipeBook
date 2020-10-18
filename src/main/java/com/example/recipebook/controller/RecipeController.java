package com.example.recipebook.controller;


import com.example.recipebook.model.Category;
import com.example.recipebook.model.Recipe;
import com.example.recipebook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

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
    public String all(@RequestParam(name = "category", required = false) Category category, Model model) {
        List<Recipe> recipies;
        if (category != null) {
            recipies = recipeService.findByCategory(category);
        } else {
            recipies = recipeService.findAll();
        }
        model.addAttribute("allOrCategory", recipies);
        return "all-recipies";
    }

    @GetMapping("/add")
    public String getAddForm(Model model) {
        Recipe recipe = new Recipe();

        model.addAttribute("recipe", recipe);
        model.addAttribute("mode", "add");
        return "add-recipe";

    }

    @PostMapping("/add")
    public String add(Recipe recipe) {
        recipeService.save(recipe);
        return "redirect:/przepis?id=" + recipe.getId();
    }

    @GetMapping("/przepis")
    String getOneRecip(@RequestParam Long id, Model model) {
        Optional<Recipe> recipe = recipeService.findById(id);

        if (recipe.isPresent()) {
            model.addAttribute("recipe", recipe.get());
            return "recipe";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping("/edytuj")
    String getEditForm(@RequestParam Long id, Model model) {
        Optional<Recipe> recipe = recipeService.findById(id);

        if (recipe.isPresent()) {
            model.addAttribute("recipe", recipe.get());
            model.addAttribute("mode", "edit");
            return "add-recipe";
        } else {
            return "redirect:/";
        }
    }

    @PostMapping("/edytuj")
    String edit(Recipe recipe) {
        Optional<Recipe> optionalRecipe = recipeService.findById(recipe.getId());
        if (optionalRecipe.isPresent()) {
            Recipe recipeFormRepository = optionalRecipe.get();
            recipeFormRepository.setName(recipe.getName());
            recipeFormRepository.setDescription(recipe.getDescription());
            recipeFormRepository.setUrl(recipe.getUrl());
            recipeFormRepository.setCategory(recipe.getCategory());
            recipeService.save(recipeFormRepository);
            return "redirect:/przepis?id=" + recipeFormRepository.getId();
        } else {
            return "redirect:/";
        }
    }

    @GetMapping("/like")
    public String addLike (@RequestParam Long id) {
     recipeService.optionalAddLike(id);
     return
        }

    }
}


