package com.example.boardfirst.dto.request;

import com.example.boardfirst.domain.Article;
import lombok.Getter;

@Getter
public class AddArticleDto {

    private String title;
    private String content;

    public Article toEntity() {
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }

}
