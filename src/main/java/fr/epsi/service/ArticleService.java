package fr.epsi.service;

import java.util.List;

import fr.epsi.dto.ArticleDTO;
import fr.epsi.entite.Article;

public interface ArticleService {
	
	void create(ArticleDTO a);
	
	List<Article> findAllArticles();

}
