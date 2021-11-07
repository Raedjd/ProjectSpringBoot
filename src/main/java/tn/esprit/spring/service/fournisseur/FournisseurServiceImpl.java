package tn.esprit.spring.service.fournisseur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Fournisseur;
import tn.esprit.spring.repository.FournisseurRepository;
@Service
public class FournisseurServiceImpl implements IFournisseurService {
     

    @Autowired
    private FournisseurRepository fournisseurRepository;
    
	@Override
	public Fournisseur add(Fournisseur fournisseur) {
		// TODO Auto-generated method stub
		return fournisseurRepository.save(fournisseur);
	}

	@Override
	public Fournisseur update(Fournisseur fournisseur, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		fournisseurRepository.deleteById(id);
	}

	@Override
	public List<Fournisseur> findAll() {
		// TODO Auto-generated method stub
		return fournisseurRepository.findAll();
	}

	@Override
	public Fournisseur findById(Long id) {
		// TODO Auto-generated method stub
		return fournisseurRepository.getOne(id);
	}

}
