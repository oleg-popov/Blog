package org.itstep.impl;

import org.itstep.CommentDao;
import org.itstep.entity.Comment;
import org.itstep.entity.Post;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CommentDaoMySqlIml implements CommentDao {
    private final EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("post_db");
    private final EntityManager em = entityManagerFactory.createEntityManager();
    @Override
    public Integer save(Comment data) {
        try {
            em.getTransaction().begin();
            em.persist(data);
            em.getTransaction().commit();
            return data.getId();
        } catch (Throwable th) {
            th.printStackTrace();
            em.getTransaction().rollback();
        }
        return null;
    }
}
