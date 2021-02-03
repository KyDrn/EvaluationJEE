package fr.epsi.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.dto.ClientDTO;
import fr.epsi.entite.Client;
import fr.epsi.service.ClientService;

//Couche WEB
public class ListeClientsServlet extends HttpServlet{
	
	@EJB
	private ClientService service;
	//même chose 
	//private VoitureService service = new VoitureServiceImpl();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	        
	    {
		List<Client> clients=service.findAllClients();
		req.setAttribute("clients", clients);
		  this.getServletContext().getRequestDispatcher("/WEB-INF/ListeClients.jsp").forward(req, resp);
	    }

}
