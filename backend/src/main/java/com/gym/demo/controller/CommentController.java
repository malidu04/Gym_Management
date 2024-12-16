package com.gym.demo.controller;

import com.gym.demo.DTO.CommentDTO;
import com.gym.demo.model.Comment;
import com.gym.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts/{postId}/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public ResponseEntity<List<Comment>> getCommentsForPost(@PathVariable String postId) {
        List<Comment> comments = commentService.getCommentsForPost(postId);
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Comment> addCommentToPost(@PathVariable String postId, @RequestBody CommentDTO request) {
        Comment comment = commentService.addCommentToPost(postId, request.getContent(), request.getCommentBy(), request.getCommentById() ,request.getCommentByProfile());
        return new ResponseEntity<>(comment, HttpStatus.CREATED);
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<Void> deleteComment(@PathVariable String postId, @PathVariable String commentId) {
        commentService.deleteComment(postId, commentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{commentId}")
    public ResponseEntity<Comment> editComment(@PathVariable String commentId, @RequestBody CommentDTO request) {
        Comment editedComment = commentService.editComment(commentId, request.getContent());
        if (editedComment != null) {
            return new ResponseEntity<>(editedComment, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}