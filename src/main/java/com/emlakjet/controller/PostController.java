package com.emlakjet.controller;

import com.emlakjet.service.PostInterface;
import com.emlakjet.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api")
public class PostController {
    private final PostInterface postInterface;

    @PostMapping(value = "/create")
    public ResponseEntity<PostResponse> createPost(@RequestBody PostRequest postRequest) {
        PostService postService = postRequest.toPost();
        postInterface.cratePost(postService);
        PostResponse postResponse = PostResponse.valueOf(postService);
        return ResponseEntity.status(HttpStatus.CREATED)
                             .body(postResponse);
    }
}
