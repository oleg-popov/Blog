package org.itstep.impl;

import org.itstep.PostDao;
import org.itstep.entity.Post;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class PostDaoMySqlIml implements PostDao {
    private List<Post> posts = new CopyOnWriteArrayList<>();
    private final EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("post_db");
   private final EntityManager em = entityManagerFactory.createEntityManager();

    @Override
    public Integer save(Post post) {
        try {
            em.getTransaction().begin();
            em.persist(post);
            em.getTransaction().commit();
            return post.getId();
        } catch (Throwable th) {
            em.getTransaction().rollback();
            th.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Post> findAll() {
        try {
            em.getTransaction().begin();
            List<Post> posts = em.createQuery("from Post", Post.class).getResultList();
            em.getTransaction().commit();
            return posts;
        } catch (Throwable th) {
            em.getTransaction().rollback();
            th.printStackTrace();
        }
        return null;
    }

    @Override
    public Post findById(Integer integer) {
        try {
            em.getTransaction().begin();
            Post post = em.find(Post.class , integer);
            em.getTransaction().commit();
            return post;
        } catch (Throwable th) {
            em.getTransaction().rollback();
            th.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Integer integer) {
        try {
            em.getTransaction().begin();
            Post post = em.find(Post.class, integer);
            em.remove(post);
            em.getTransaction().commit();
        } catch (Throwable th) {
            em.getTransaction().rollback();
            th.printStackTrace();
        }
    }

    @Override
    public Post update(Post post) {
        try {
            em.getTransaction().begin();
            em.merge(post);
            em.getTransaction().commit();
            return post;
        } catch (Throwable throwable) {
            em.getTransaction().rollback();
            throwable.printStackTrace();
        }
        return null;
    }


}
