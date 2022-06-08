package com.emlakjet.dao;

import com.emlakjet.common.PostCategory;
import com.emlakjet.model.Post;
import com.emlakjet.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostDaoImpl implements PostDao{

    private final PostRepository postRepository;

    @Override
    public Post cratePost(Post post) {
        post.setCreatedAt(Instant.now());
        post.setUpdatedAt(Instant.now());
        return postRepository.save(post);
    }

    @Override
    public Optional<Post> getPost(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public Post updatePost(Post post, String username) {
        return null;
    }

    @Override
    public Optional<Post> findPostsByAuthor(String author) {
        return postRepository.findPostsByAuthor(author);
    }

    @Override
    public Optional<Post> findPostsByCategory(PostCategory postCategory) {
        return postRepository.findPostsByCategory(postCategory);
    }

    @Override
    public Optional<Post> getLatestPost() {
        return postRepository.findFirst3ByOrderByCreatedAtDesc();
    }
}
