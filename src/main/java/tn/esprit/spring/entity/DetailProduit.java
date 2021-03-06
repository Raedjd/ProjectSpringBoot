package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
@Table(name="TABLE_DETAIL_PRODUIT")
public class DetailProduit implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailProduit;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDerniereModification;

    private CategorieProduit categorieProduit;
    
    @OneToOne(mappedBy="detailProduit")
    private Produit produit;
    public DetailProduit() {};
	public DetailProduit(Date dateCreation, Date dateDerniereModification, CategorieProduit categorieProduit) {
		super();
		this.dateCreation = dateCreation;
		this.dateDerniereModification = dateDerniereModification;
		this.categorieProduit = categorieProduit;
	}
   /*
	public Long getIdDetailProduit() {
		return idDetailProduit;
	}

	public void setIdDetailProduit(Long idDetailProduit) {
		this.idDetailProduit = idDetailProduit;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateDerniereModification() {
		return dateDerniereModification;
	}

	public void setDateDerniereModification(Date dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}

	public CategorieProduit getCategorieProduit() {
		return categorieProduit;
	}

	public void setCategorieProduit(CategorieProduit categorieProduit) {
		this.categorieProduit = categorieProduit;
	}
    */
}
