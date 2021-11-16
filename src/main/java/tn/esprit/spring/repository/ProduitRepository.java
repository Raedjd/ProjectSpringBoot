package tn.esprit.spring.repository;
 
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.entity.Stock;
@Repository
public interface ProduitRepository extends JpaRepository <Produit,Long> {
	 
	  //JPQL
	   @Query(value ="SELECT (" +"SELECT sum(df.qte)FROM DetailFacture df  WHERE df.produit.idProduit = ?1" +") "
	   		+ "AS  qte " +"FROM DetailProduit dp  " +"WHERE dp.dateCreation BETWEEN ?2 AND ?3 ")
	    int getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate);

	 
 
}
