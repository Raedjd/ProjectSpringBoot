package tn.esprit.spring.service.facture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.repository.FactureRepository;

@Service
public class FactureServiceImpl implements IFactureService {
    
	@Autowired
    private FactureRepository factureRepository;

	@Override
	public Facture add(Facture facture) {
		// TODO Auto-generated method stub
		return factureRepository.save(facture);
	}

	@Override
	public Facture update(Facture facture, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		factureRepository.deleteById(id);
	}

	@Override
	public List<Facture> findAll() {
		// TODO Auto-generated method stub
		return factureRepository.findAll();
	}

	@Override
	public Facture findById(Long id) {
		// TODO Auto-generated method stub
		return factureRepository.getOne(id);
	}

}
