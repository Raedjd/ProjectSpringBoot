package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="TABLE_RAYON")
public class Rayon  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRayon;
    private String code;
    private String libelle;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="rayon")
    private List<Produit> produit;
	   public Rayon() {
	        
	    }

	    public Rayon(String code, String libelle) {
	        this.code = code;
	        this.libelle = libelle;
	        produit = new ArrayList<>();
	    }
   /*
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
    */
}

