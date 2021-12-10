package tn.esprit.spring.service.facture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.entity.Fournisseur;
import tn.esprit.spring.repository.FactureRepository;

@Service
public class FactureServiceImpl implements IFactureService {
    
	@Autowired
    private FactureRepository factureRepository;

	@Override
	public Facture add(Facture facture) {
		return factureRepository.save(facture);
	}
 
	@Override
	public Facture update(Facture facture, Long id) {
		  if(factureRepository.findById(id).isPresent()){
	            Facture fact = factureRepository.findById(id).get();
	            fact.setMontantRemise(facture.getMontantRemise());
	            fact.setMontantFacture(facture.getMontantFacture());
	            fact.setDateFacture(facture.getDateFacture());
	            fact.setActive(facture.getActive());
	            return factureRepository.save(fact);
	        }
	        return null;
	    }

	@Override
	public void cancelFacture(long id) {
		factureRepository.deleteById(id);
		
	}

	@Override
	public List<Facture> findAll() {
		return factureRepository.findAll();
	}

	@Override
	public Facture findById(Long id) {
		return factureRepository.findById(id).get();
	}


	@Override
	public List<Facture> getFacturesByClient(Long idClient) {
		  return factureRepository.getFacturesByClient(idClient);
	}

}
