package org.itstep.service;

import org.itstep.entity.Comment;
import org.itstep.impl.CommentDaoMySqlIml;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private final CommentDaoMySqlIml commentDaoMySqlIml = new CommentDaoMySqlIml();
    public void addComment(Comment comment){
        commentDaoMySqlIml.save(comment);
    }
}
