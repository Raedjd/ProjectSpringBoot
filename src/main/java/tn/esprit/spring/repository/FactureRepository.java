package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entity.Facture;
@Repository
public interface FactureRepository extends JpaRepository <Facture,Long> {
 
	//JPQL
	@Query(value = "SELECT f FROM Facture f WHERE f.client.idClient = ?1")
    List<Facture> getFacturesByClient(Long idClient);
}
