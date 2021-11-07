package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TABLE_DETAIL_FACTURE")
public class DetailFacture implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;

    private int qte;
    private float prixtotal;
    private int pourcentageRemise;
    private float montantRemise;
    
      @ManyToOne()
	  @JoinColumn(name = "idProduit")
	  private Produit produit;
      
      @ManyToOne()
	  @JoinColumn(name = "idFacture")
	  private Facture facture;
    
	public DetailFacture(int qte, float prixtotal, int pourcentageRemise, float montantRemise) {
		super();
		this.qte = qte;
		this.prixtotal = prixtotal;
		this.pourcentageRemise = pourcentageRemise;
		this.montantRemise = montantRemise;
	}
	public Long getIdDetailFacture() {
		return idDetailFacture;
	}
	public void setIdDetailFacture(Long idDetailFacture) {
		this.idDetailFacture = idDetailFacture;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public float getPrixtotal() {
		return prixtotal;
	}
	public void setPrixtotal(float prixtotal) {
		this.prixtotal = prixtotal;
	}
	public int getPourcentageRemise() {
		return pourcentageRemise;
	}
	public void setPourcentageRemise(int pourcentageRemise) {
		this.pourcentageRemise = pourcentageRemise;
	}
	public float getMontantRemise() {
		return montantRemise;
	}
	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}
    
    
}
