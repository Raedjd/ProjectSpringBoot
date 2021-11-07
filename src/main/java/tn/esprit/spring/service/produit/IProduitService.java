package tn.esprit.spring.service.produit;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Produit;
@Service
public interface IProduitService {
	Produit add(Produit produit);
    Produit update(Produit produit, Long id);
    void delete(long id);
    List<Produit> findAll();
    Produit findById(Long id);
}
