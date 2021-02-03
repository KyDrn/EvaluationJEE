package fr.epsi.entite;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneFacture {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn( name="idfacture" )
    private Facture idfacture;
    
    @ManyToOne
    @JoinColumn( name="idarticle" )
    private Article idarticle;
    
    private Long qte;
    private Double prix;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Facture getIdfacture() {
        return idfacture;
    }
    public void setIdfacture(Facture idFacture) {
        this.idfacture = idFacture;
    }
    public Article getIdarticle() {
        return idarticle;
    }
    public void setIdarticle(Article idArticle) {
        this.idarticle = idArticle;
    }
    public Double getPrix() {
        return prix;
    }
    public void setPrix(Double prix) {
        this.prix = prix;
    }
	public Long getQte() {
		return qte;
	}
	public void setQte(Long qte) {
		this.qte = qte;
	}
    

}