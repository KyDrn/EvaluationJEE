package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Facture;

public interface FactureService {
	
	List<Facture> findAllFactures();
	
	Facture findFactureById(Long id);

}
