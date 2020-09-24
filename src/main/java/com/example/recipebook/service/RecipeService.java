package com.example.recipebook.service;


import com.example.recipebook.model.Recipe;
import com.example.recipebook.repository.CategoryRepositiry;
import com.example.recipebook.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    private RecipeRepository recipeRepository;
    private CategoryRepositiry categoryRepositiry;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository, CategoryRepositiry categoryRepositiry) {
        this.recipeRepository = recipeRepository;
        this.categoryRepositiry = categoryRepositiry;
    }

    public void save(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }
}
