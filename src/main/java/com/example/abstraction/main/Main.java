package com.example.abstraction.main;

import com.example.abstraction.config.ProjectConfig;
import com.example.abstraction.model.Comment;
import com.example.abstraction.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var comment = new Comment();
        comment.setText("This is a comment");
        comment.setAuthor("Jibesh Shrestha");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
