package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="TABLE_PRODUIT")
public class Produit implements Serializable  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	 @Column(name="ID_PRODUIT")
	 private Long idProduit;
	 @Column(name="CODE")
     private String code;
	 @Column(name="LIBELLE")
     private String libelle;
	 @Column(name="PRIX_UNITAIRE")
     private float prixUnitaire;
	 
	 @OneToOne
	 @JoinColumn(name = "idDetailProduit")
	 private DetailProduit detailProduit;
	 
	  @ManyToOne()
	  @JoinColumn(name = "idStock")
	  private Stock stock;
	  
	  @ManyToOne()
	  @JoinColumn(name = "idRayon") 
	  private Rayon rayon;
	 
	  @OneToMany(cascade = CascadeType.ALL, mappedBy="produit")
	  private Set<DetailFacture> detailFacture;
	  
	  @ManyToMany(cascade = CascadeType.ALL)
	  @JoinTable(name="TABLE_PRODUIT_FOURNISSEUR")
	  private Set<Fournisseur> fournisseur;
	  
	  public Produit() {};
	  public Produit(String code, String libelle, float prixUnitaire) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.prixUnitaire = prixUnitaire;
	}
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
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
	public float getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	 
	 
}