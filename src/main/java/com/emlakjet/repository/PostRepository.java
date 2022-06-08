package com.emlakjet.repository;

import com.emlakjet.common.PostCategory;
import com.emlakjet.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
    Optional<Post> findPostsByAuthor(String author);
    Optional<Post> findPostsByCategory(PostCategory postCategory);
    Optional<Post> findFirst3ByOrderByCreatedAtDesc();
}
