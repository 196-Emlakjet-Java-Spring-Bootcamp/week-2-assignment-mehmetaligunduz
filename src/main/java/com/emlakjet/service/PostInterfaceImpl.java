package com.emlakjet.service;

import com.emlakjet.common.PostCategory;
import com.emlakjet.dao.PostDao;
import com.emlakjet.model.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostInterfaceImpl implements PostInterface {

    private final PostDao postDao;
    @Override
    public PostService cratePost(PostService postService) {
        Post post = postService.toPost();
        postDao.cratePost(post);
        return PostService.valueOf(post);
    }

    @Override
    public Optional<Post> getPost(Long id) {
        return postDao.getPost(id);
    }

    @Override
    public PostService updatePost(PostService postService, String username) {
        return null;
    }

    @Override
    public Optional<Post> findPostsByAuthor(String author) {
        return postDao.findPostsByAuthor(author);
    }

    @Override
    public Optional<Post> findPostsByCategory(PostCategory postCategory) {
        return postDao.findPostsByCategory(postCategory);
    }

    @Override
    public Optional<Post> getLatestPost() {
        return postDao.getLatestPost();
    }
}
