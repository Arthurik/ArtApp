package ru.arthur.model.dao;

import ru.arthur.entities.Article;

import java.util.List;

/**
 * Created by salimhanov on 11.07.2014.
 */
public interface ArticleDAO {
    ArticleDAO INSTANCE_ARTICLE = new ArticleDAOImpl();
        public List<Article> getArticle();




}
