package com.example.abstraction.repositories;

import com.example.abstraction.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepo implements CommentRepo {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment " + comment.getText());
    }
}
