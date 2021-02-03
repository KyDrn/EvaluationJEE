package fr.epsi.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.dto.ArticleDTO;
import fr.epsi.entite.Article;
import fr.epsi.service.ArticleService;

//Couche WEB
public class ListeArticlesServlet extends HttpServlet{
	
	@EJB
	private ArticleService service;
	//même chose 
	//private VoitureService service = new VoitureServiceImpl();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	        
	    {
		List<Article> articles=service.findAllArticles();
		req.setAttribute("articles", articles);
		  this.getServletContext().getRequestDispatcher("/WEB-INF/ListeArticles.jsp").forward(req, resp);
	    }

}
