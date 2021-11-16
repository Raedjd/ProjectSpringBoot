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
		return fournisseurRepository.save(fournisseur);
	}

	@Override
	public Fournisseur update(Fournisseur fournisseur, Long id) {
	    if(fournisseurRepository.findById(id).isPresent()){
            Fournisseur fourn = fournisseurRepository.findById(id).get();
            fourn.setCode(fournisseur.getCode());
            fourn.setLibelle(fournisseur.getLibelle());
            fourn.setProduit(fournisseur.getProduit());
            return fournisseurRepository.save(fourn);
        }
        return null;
    }
	

	@Override
	public void delete(long id) {
		fournisseurRepository.deleteById(id);
	}

	@Override
	public List<Fournisseur> findAll() {
		return fournisseurRepository.findAll();
	}

	@Override
	public Fournisseur findById(Long id) {
		return fournisseurRepository.findById(id).get();
	}

	@Override
	public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
		
		
	}

}
