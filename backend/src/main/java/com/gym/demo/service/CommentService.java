package com.gym.demo.service;

import com.gym.demo.model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getCommentsForPost(String postId);
    Comment addCommentToPost(String postId, String content, String commentBy, String commentById ,String commentByProfile);
    void deleteComment(String postId, String commentId);

    Comment editComment(String commentId, String content);
}
