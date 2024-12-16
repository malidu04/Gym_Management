package com.gym.demo.service;

import com.gym.demo.DTO.ShareDTO;
import com.gym.demo.model.SharePostModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SharePostService {
    List<SharePostModel> getSharePosts();


    SharePostModel createSharePost(ShareDTO shareDTO);
    void deleteSharedPost(String id);

    List<SharePostModel> getSharePostsByuser(String id);
}
