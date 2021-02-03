package fr.epsi.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Facture;
import fr.epsi.entite.LigneFacture;
import fr.epsi.service.FactureService;
import fr.epsi.service.LigneFactureService;

//Couche WEB
public class FactureServlet extends HttpServlet{
	
	@EJB
	private FactureService serviceFacture;
	@EJB
	private LigneFactureService service;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	        
	    {
		Facture facture = serviceFacture.findFactureById(Long.parseLong(req.getParameter("id")));
		req.setAttribute("facture", facture);
		List<LigneFacture> lignesFacture=service.findAllLignesFacture(Long.parseLong(req.getParameter("id")));
		req.setAttribute("lignesFacture", lignesFacture);
		  this.getServletContext().getRequestDispatcher("/WEB-INF/factureDetails.jsp").forward(req, resp);
	    }

}
