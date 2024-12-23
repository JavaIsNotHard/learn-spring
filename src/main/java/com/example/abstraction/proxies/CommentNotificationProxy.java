package com.example.abstraction.proxies;

import com.example.abstraction.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
