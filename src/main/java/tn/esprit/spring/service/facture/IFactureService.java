package tn.esprit.spring.service.facture;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Facture;
@Service
public interface IFactureService {
	    Facture add(Facture facture);
	    Facture update(Facture facture, Long id);
	    void cancelFacture(long id);
	    List<Facture> findAll();
	    Facture findById(Long id);
	    List<Facture> getFacturesByClient(Long idClient);
}
