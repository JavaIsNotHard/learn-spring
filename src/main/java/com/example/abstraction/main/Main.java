package com.example.abstraction.main;

import com.example.abstraction.model.Comment;
import com.example.abstraction.proxies.EmailCommentNotificationProxy;
import com.example.abstraction.repositories.DBCommentRepo;
import com.example.abstraction.service.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepo = new DBCommentRepo();
        var commentProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(commentRepo, commentProxy);
        var comment = new Comment();
        comment.setAuthor("Jibesh Shrestha");
        comment.setText("This is a comment");

        commentService.publishComment(comment);
    }
}
