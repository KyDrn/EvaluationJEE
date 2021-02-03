package fr.epsi.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Facture;
import fr.epsi.service.FactureService;

//Couche WEB
public class ListeFacturesServlet extends HttpServlet{
	
	@EJB
	private FactureService service;
	//même chose 
	//private VoitureService service = new VoitureServiceImpl();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	        
	    {
		List<Facture> factures=service.findAllFactures();
		req.setAttribute("factures", factures);
		  this.getServletContext().getRequestDispatcher("/WEB-INF/ListeFactures.jsp").forward(req, resp);
	    }

}
