package com.example.recipebook.repository;

import com.example.recipebook.model.Category;
import com.example.recipebook.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {


    List<Recipe> findAll();


    List<Recipe> findAllByCategory(Category category);

    List<Recipe> findAllByLikesOrderByLikesDesc();
}


