package com.cisdijob.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cisdijob.dao.ArticleDAO;
import com.cisdijob.model.entity.Article;
import com.cisdijob.service.pages.ArticleService;
@Service
@Transactional(rollbackFor = Exception.class)
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDAO articleDAO;
	public Article getArticleById(int id) {
		// TODO Auto-generated method stub
		return articleDAO.getArticleById(id);
	}
	public List<Article> getArticleList() {
		// TODO Auto-generated method stub
		return articleDAO.getArticleList();
	}
	public void insertArticle(Article article) {
		// TODO Auto-generated method stub
		articleDAO.insertArticle(article);
	}

}
