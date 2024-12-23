package com.example.abstraction.proxies;

import com.example.abstraction.model.Comment;


public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending comment to email" + comment.getText());
    }
}
