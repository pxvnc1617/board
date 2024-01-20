package com.example.boardfirst.domain;

import com.example.boardfirst.dto.request.UpdateArticleDto;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Builder
    // For constructor
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // For update
    public void update(UpdateArticleDto updateArticleDto) {
        this.title = updateArticleDto.getTitle();
        this.content = updateArticleDto.getContent();
    }

}
