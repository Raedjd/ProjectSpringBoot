package tn.esprit.spring.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.CategorieClient;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Profession;

@Repository
public interface ClientRepository extends JpaRepository <Client,Long> {
	
	 List<Client> findAllByCategorieClient(CategorieClient categorieClient);
/*
	//JPQL SELECT  
	@Query("SELECT c FROM Client c WHERE c.profession= :profession")
	List<Client> retrieveClientsByProfession(@Param("profession") Profession profession); 
	
	//JPQL UPDATE
	@Modifying
	@Query("update Client c set c.categorieClient = :categorie where u.profession = :profession")
	int updateClientCategorieByProfession(@Param("categorie") CategorieClient categorieClient, @Param("profession") Profession profession);

	//JPQL DELETE
	@Modifying 
	@Query("DELETE FROM Client c WHERE c.categorieClient= :categorie AND  c.profession = :profession")
	int deleteClientByCategorieClientAndProfession(@Param("categorie") 
	CategorieClient categorieClient, @Param("profession") Profession profession);
	
	//NATIVE QUERY INSERT
	@Modifying
	@Query(value = "INSERT INTO Client (nom, prenom, dateNaissance,email,password,profession,categorieClient) VALUES (:nom, :prenom, :dateN, :email, :password, :profession, :categorieClient)", nativeQuery = true)
	void insertClient(@Param("nom") String nom, @Param("prenom") String prenom, 
			@Param("dateN") Date dateNaissance, @Param("email") String email, 
			@Param("password") String password, @Param("profession") Profession 
			profession, @Param("categorieClient") CategorieClient categorieClient);

*/
	
}
