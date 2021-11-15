package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="TABLE_RAYON")
public class Rayon  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRayon;
    private String code;
    private String libelle;
	public Rayon(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="rayon")
    private Set<Produit> Produit;
	public Rayon() {};
	public Rayon(String code, String libelle, Set<tn.esprit.spring.entity.Produit> produit) {
		super();
		this.code = code;
		this.libelle = libelle;
		Produit = produit;
	}
	public Long getIdRayon() {
		return idRayon;
	}
	public void setIdRayon(Long idRayon) {
		this.idRayon = idRayon;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
    
}

