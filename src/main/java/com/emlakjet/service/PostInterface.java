package com.emlakjet.service;

import com.emlakjet.common.PostCategory;
import com.emlakjet.model.Post;

import java.util.Optional;

public interface PostInterface {
    PostService cratePost(PostService post);

    Optional<Post> getPost(Long id);

   PostService updatePost(PostService post, String username);

    Optional<Post> findPostsByAuthor(String author);

    Optional<Post> findPostsByCategory(PostCategory postCategory);

    Optional<Post> getLatestPost();
}
