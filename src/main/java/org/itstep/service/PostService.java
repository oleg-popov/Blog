package org.itstep.service;

import org.itstep.entity.Post;
import org.itstep.PostDao;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PostService {
    private final PostDao dao;

    public PostService(PostDao dao) {
        this.dao = dao;
    }

    public void addPost(Post post) {
        dao.save(post);
    }

    public List<Post> findAll() {
        return dao.findAll();
    }

    public void remove(Integer integer) {
        dao.delete(integer);
    }

    public Post findById(Integer integer) {
        return dao.findById(integer);
    }

    public Post update(Post data) {
        return dao.update(data);
    }
}