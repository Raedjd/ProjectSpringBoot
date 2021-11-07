package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
 
@Entity
//ANNOTATION LOMBOK
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
//@Data
@Table(name="TABLE_FACTURE")
public class Facture implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture;
    @NonNull
    private float montantRemise;
    @NonNull
    private float montantFacture;
    @Temporal(TemporalType.DATE)
    @NonNull
    private Date dateFacture;
    @NonNull
    private Boolean active;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy="facture")
	  private Set<DetailFacture> detailFacture;
    
    @ManyToOne()
	@JoinColumn(name = "idClient")
	private Client client;
   /* 
	public Facture(float montantRemise, float montantFacture, Date dateFacture, Boolean active) {
		super();
		this.montantRemise = montantRemise;
		this.montantFacture = montantFacture;
		this.dateFacture = dateFacture;
		this.active = active;
	}
	public Long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}
	public float getMontantRemise() {
		return montantRemise;
	}
	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}
	public float getMontantFacture() {
		return montantFacture;
	}
	public void setMontantFacture(float montantFacture) {
		this.montantFacture = montantFacture;
	}
	public Date getDateFacture() {
		return dateFacture;
	}
	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
    */
}
