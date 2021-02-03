package fr.epsi.service;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Facture;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class FactureServiceImpl implements FactureService {

	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	public List<Facture> findAllFactures() {
		List<Facture> liste = em.createQuery("SELECT f FROM Facture f", Facture.class)
				.getResultList();
		
		return liste;
	}
	
	public Facture findFactureById(Long id) {
		Facture facture = em.createQuery("SELECT f FROM Facture f WHERE f.id = :id", Facture.class)
				.setParameter("id", id).getSingleResult();
		
		return facture;
	}

}
