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
import fr.epsi.entite.LigneFacture;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class LigneFactureServiceImpl implements LigneFactureService {

	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	public List<LigneFacture> findAllLignesFacture(Long idfacture) {
		Facture f = new Facture();
		f.setId(idfacture);
		List<LigneFacture> liste = em.createQuery("SELECT l FROM LigneFacture l WHERE l.idfacture = :idfacture", LigneFacture.class)
				.setParameter("idfacture", f).getResultList();
		
		return liste;
	}

}
