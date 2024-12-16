package com.gym.demo.repo;


import com.gym.demo.model.SharePostModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SharePostRepository extends MongoRepository<SharePostModel, String> {
    List<SharePostModel> findByUserId(String userId);
}
