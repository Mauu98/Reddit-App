package com.app.reddit.spring.repository;

import com.app.reddit.spring.model.Post;
import com.app.reddit.spring.model.Subreddit;
import com.app.reddit.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
