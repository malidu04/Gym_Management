package com.gym.demo.repo;

import com.gym.demo.model.MealPlan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealPlanRepository extends MongoRepository<MealPlan, String> {

}
