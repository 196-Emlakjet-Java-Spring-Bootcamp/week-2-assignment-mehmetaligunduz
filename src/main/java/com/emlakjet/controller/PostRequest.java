package com.emlakjet.controller;

import com.emlakjet.common.PostCategory;
import com.emlakjet.service.PostService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostRequest {
    private Long id;
    private String author;
    private String title;
    private String text;
    private String updatedBy;
    private PostCategory category;

    PostService toPost() {
        return PostService.builder()
                   .id(getId())
                   .author(getAuthor())
                   .title(getTitle())
                   .text(getText())
                   .updatedBy(getUpdatedBy())
                   .category(getCategory())
                   .build();
    }
}
