package com.handzap.assignment.scrapper.service;

import com.handzap.assignment.scrapper.model.Article;
import com.handzap.assignment.scrapper.searchcriteria.ArticleSearchCriteria;

import java.util.List;

/**
 * Created by kumarrak on 27/12/18.
 */
public interface ArticleService {
    void save(Article article);
    Article get(String author, String title);
    List<Article> search(ArticleSearchCriteria articleSearchCriteria);
    List<String> findAllAuthors();
}
