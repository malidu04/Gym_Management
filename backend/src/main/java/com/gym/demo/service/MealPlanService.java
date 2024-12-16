package com.gym.demo.service;

import java.util.List;
import java.util.Optional;

import com.gym.demo.model.MealPlan;

public interface MealPlanService {
    List<MealPlan> getAllMealPlans();

    Optional<MealPlan> getMealPlanById(String mealPlanId);

    MealPlan createMealPlan(MealPlan mealPlan);

    MealPlan updatMealPlan(String mealPlanId, MealPlan mealPlan);

    void deleteMealPlan(String mealPlanId);
}
