package com.emlakjet.controller;

import com.emlakjet.service.PostService;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostResponse {
    private Long id;
    private String title;
    private String author;
    private String text;

    public static PostResponse valueOf(PostService postService) {
        return PostResponse.builder()
                           .id(postService.getId())
                           .author(postService.getAuthor())
                           .title(postService.getTitle())
                           .text(postService.getText())
                           .build();
    }
}
