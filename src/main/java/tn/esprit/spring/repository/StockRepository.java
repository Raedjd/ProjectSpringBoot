package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Stock;
@Repository
public interface StockRepository extends JpaRepository <Stock,Long> {
 
	
}
