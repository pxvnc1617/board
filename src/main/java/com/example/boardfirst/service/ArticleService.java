package com.example.boardfirst.service;

import com.example.boardfirst.domain.Article;
import com.example.boardfirst.dto.request.AddArticleDto;
import com.example.boardfirst.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    // Article 등록 service 메서드
    public Article createArticle(AddArticleDto articleDto) {
        return articleRepository.save(articleDto.toEntity());
    }

}
