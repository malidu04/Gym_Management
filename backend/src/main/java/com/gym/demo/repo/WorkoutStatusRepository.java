package com.gym.demo.repo;

import com.gym.demo.model.WorkoutStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutStatusRepository extends MongoRepository<WorkoutStatus, String> {

}