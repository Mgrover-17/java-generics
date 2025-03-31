package com.bridgelabz.mealPlan;

public class MealPlanGenerator {
    public static void main(String[] args) {
        Meal<VeganMeal> vegan = new Meal<>(new VeganMeal());
        MealPlanner.generateMealPlan(vegan);
    }
}
