package com.emlakjet.dao;

import com.emlakjet.common.PostCategory;
import com.emlakjet.model.Post;

import java.util.Optional;

public interface PostDao {

    Post cratePost(Post post);

    Optional<Post> getPost(Long id);

    Post updatePost(Post post, String username);

    Optional<Post> findPostsByAuthor(String author);

    Optional<Post> findPostsByCategory(PostCategory postCategory);

    Optional<Post> getLatestPost();
}
