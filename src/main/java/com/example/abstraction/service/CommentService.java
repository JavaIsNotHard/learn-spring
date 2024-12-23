package com.example.abstraction.service;

import com.example.abstraction.model.Comment;
import com.example.abstraction.proxies.CommentNotificationProxy;
import com.example.abstraction.repositories.CommentRepo;


public class CommentService {
    private final CommentRepo commentRepo;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepo commentRepo, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepo = commentRepo;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepo.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}