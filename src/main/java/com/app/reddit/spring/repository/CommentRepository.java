package com.app.reddit.spring.repository;


import com.app.reddit.spring.model.Comment;
import com.app.reddit.spring.model.Post;
import com.app.reddit.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
