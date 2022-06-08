package com.emlakjet.service;

import com.emlakjet.common.PostCategory;
import com.emlakjet.model.Post;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;


@Getter
@Builder
@EqualsAndHashCode
public class PostService {
    private Long id;
    private String author;
    private String title;
    private String text;
    private String updatedBy;
    private PostCategory category;

    Post toPost() {
        return Post.builder()
                   .id(getId())
                   .author(getAuthor())
                   .title(getTitle())
                   .text(getText())
                   .updatedBy(getUpdatedBy())
                   .category(getCategory())
                   .build();
    }

    public static PostService valueOf(Post post) {
        return PostService.builder()
                          .id(post.getId())
                          .author(post.getAuthor())
                          .title(post.getTitle())
                          .text(post.getText())
                          .updatedBy(post.getUpdatedBy())
                          .category(post.getCategory())
                          .build();
    }

}
