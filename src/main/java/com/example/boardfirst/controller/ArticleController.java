package com.example.boardfirst.controller;

import com.example.boardfirst.domain.Article;
import com.example.boardfirst.dto.request.AddArticleDto;
import com.example.boardfirst.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("Article Controller Only")
@CrossOrigin("*")
@RequestMapping("/api")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @PostMapping("/add-article")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleDto addArticleDto) {
        Article postedArticle = articleService.createArticle(addArticleDto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(postedArticle);
    }

}
