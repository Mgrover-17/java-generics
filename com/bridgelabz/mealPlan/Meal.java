package com.bridgelabz.mealPlan;

public class Meal<T extends MealPlan> {
    private T mealType;

    public Meal(T mealType) {
        this.mealType = mealType;
    }

    public void showMealDetails() {
        mealType.displayMealType();
    }
}
