package com.gym.demo.repo;

import com.gym.demo.model.WorkoutPlan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutPlanRepository extends MongoRepository<WorkoutPlan, String> {

}