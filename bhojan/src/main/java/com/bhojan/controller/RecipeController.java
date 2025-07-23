package com.bhojan.controller;

import com.bhojan.model.Recipe;
import com.bhojan.repository.RecipeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
@CrossOrigin(origins = "*")
public class RecipeController {

    private final RecipeRepository repo;

    public RecipeController(RecipeRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Recipe> getAllRecipes() {
        return repo.findAll();
    }
}
