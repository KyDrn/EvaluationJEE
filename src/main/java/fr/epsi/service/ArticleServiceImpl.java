package fr.epsi.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.ArticleDao;
import fr.epsi.dao.ArticleDaoImpl;
import fr.epsi.dto.ArticleDTO;
import fr.epsi.entite.Article;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ArticleServiceImpl implements ArticleService {

	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	public void create(ArticleDTO a)  {
		
		Article article=new Article();
		article.setNom(a.getNom());
		article.setPrix(a.getPrix());
		ArticleDao dao=new ArticleDaoImpl(em, utx);
		
		dao.create(article);
		
	}
	
	public List<Article> findAllArticles() {
		List<Article> liste = em.createQuery("SELECT a FROM Article a", Article.class)
				.getResultList();
		
		return liste;
	}

}
