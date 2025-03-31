package com.bridgelabz.mealPlan;

public class MealPlanner {
    public static <T extends MealPlan> void generateMealPlan(Meal<T> meal) {
        System.out.println("Generating meal plan...");
        meal.showMealDetails();
    }
}
