package tn.esprit.spring.service.produit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.repository.ProduitRepository;

@Service
public class ProduitServiceImpl implements IProduitService {
    
	@Autowired
    private ProduitRepository produitRepository;
	@Override
	public Produit add(Produit produit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit update(Produit produit, Long id) {
		// TODO Auto-generated method stub
		return produitRepository.save(produit);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		produitRepository.deleteById(id);
	}

	@Override
	public List<Produit> findAll() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public Produit findById(Long id) {
		// TODO Auto-generated method stub
		return produitRepository.getOne(id);
	}

}
