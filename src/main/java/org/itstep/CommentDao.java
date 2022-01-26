package org.itstep;

import org.itstep.entity.Comment;

import java.util.List;

public interface CommentDao extends GenericDao<Comment, Integer>{

    @Override
   default List<Comment> findAll(){
        return null;
    };

    @Override
    default Comment findById(Integer integer){
        return null;
    };

    @Override
    default void delete(Integer integer){};

    @Override
   default Comment update(Comment data){
        return null;
    };
}
