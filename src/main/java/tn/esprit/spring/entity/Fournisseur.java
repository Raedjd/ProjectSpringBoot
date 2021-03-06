package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity
//ANNOTATION LOMBOK
@Getter
@Setter
@ToString
//@RequiredArgsConstructor
//@AllArgsConstructor
//@Data
@Table(name="TABLE_FOURNISSEUR")
public class Fournisseur  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFournisseur;
    private String code;
    private String libelle;
    
    @ManyToMany(cascade = CascadeType.ALL, mappedBy="fournisseur")
    private List<Produit> produit;
    
    public Fournisseur() {};
	public Fournisseur(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
		 produit = new ArrayList<>();
	}
	/*
	public Long getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
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
    */
}  
