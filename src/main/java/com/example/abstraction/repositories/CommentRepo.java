package com.example.abstraction.repositories;

import com.example.abstraction.model.Comment;

public interface CommentRepo {
    void storeComment(Comment comment);
}
