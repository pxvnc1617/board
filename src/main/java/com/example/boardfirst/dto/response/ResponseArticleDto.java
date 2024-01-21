package com.example.boardfirst.dto.response;

import com.example.boardfirst.domain.Article;
import lombok.Getter;

@Getter
public class ResponseArticleDto {

    private long id;
    private String title;
    private String content;

    public ResponseArticleDto(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }

}
