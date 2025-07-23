package com.bhojan.model;

import jakarta.persistence.*;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dish_Id")
    private int dishId;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "region")
    private String region;

    @Column(name = "ingredients")
    private String ingredients;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "avg_cost")
    private int avgCost;

    @Column(name = "time_needed")
    private int timeNeeded;

    @Column(name = "recipe_by")
    private String recipeBy;

    @Column(name = "image")
    private String image;

    @Column(name = "category")
    private String category;

    @Column(name = "steps", length = 1000)
    private String cookingSteps;

    // Getters
    public int getDishId() {
        return dishId;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getRegion() {
        return region;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getQuantity() {
        return quantity;
    }

    public int getAvgCost() {
        return avgCost;
    }

    public int getTimeNeeded() {
        return timeNeeded;
    }

    public String getRecipeBy() {
        return recipeBy;
    }

    public String getImage() {
        return image;
    }

    public String getCategory() {
        return category;
    }

    public String getCookingSteps() {
        return cookingSteps;
    }

    // Setters
    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setAvgCost(int avgCost) {
        this.avgCost = avgCost;
    }

    public void setTimeNeeded(int timeNeeded) {
        this.timeNeeded = timeNeeded;
    }

    public void setRecipeBy(String recipeBy) {
        this.recipeBy = recipeBy;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCookingSteps(String cookingSteps) {
        this.cookingSteps = cookingSteps;
    }
}

