package com.example.recipebook.repository;

import com.example.recipebook.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositiry extends JpaRepository<Category, Long> {

}
