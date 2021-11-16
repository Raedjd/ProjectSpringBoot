package tn.esprit.spring.service.fournisseur;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Fournisseur;
@Service
public interface IFournisseurService {
	Fournisseur add(Fournisseur fournisseur);
    Fournisseur update(Fournisseur fournisseur, Long id);
    void delete(long id);
    List<Fournisseur> findAll();
    Fournisseur findById(Long id);
    void assignFournisseurToProduit(Long fournisseurId, Long produitId);
}
