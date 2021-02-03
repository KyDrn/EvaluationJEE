package fr.epsi.entite;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Facture {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn( name="idClient" )
    private Client idclient;
    
    private Date dateFacture;
    private String numero;
    private Double prix;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Client getIdclient() {
        return idclient;
    }
    public void setIdclient(Client idClient) {
        this.idclient = idClient;
    }
    public Date getDateFacture() {
        return dateFacture;
    }
    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Double getPrix() {
        return prix;
    }
    public void setPrix(Double prix) {
        this.prix = prix;
    }
    

}