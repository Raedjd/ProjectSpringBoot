package tn.esprit.spring.service.produit;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.repository.ProduitRepository;
import tn.esprit.spring.repository.StockRepository;
@Service
public class ProduitServiceImpl implements IProduitService {
    
	@Autowired
    private ProduitRepository produitRepository;
	
	@Autowired
    private StockRepository stockRepository;

	@Override
	public Produit add(Produit produit) {
		return produitRepository.save(produit);
	}

	@Override
	public Produit update(Produit produit, Long id) {
		  if(produitRepository.findById(id).isPresent()){
	            Produit prod = produitRepository.findById(id).get();
	            prod.setCode(produit.getCode());
	            prod.setLibelle(produit.getLibelle());
	            prod.setPrixUnitaire(produit.getPrixUnitaire());
	            prod.setDetailProduit(produit.getDetailProduit());
	            prod.setRayon(produit.getRayon());
	            prod.setStock(produit.getStock());
	            prod.setDetailFacture(produit.getDetailFacture());
	            prod.setFournisseur(produit.getFournisseur());
	            return produitRepository.save(prod);
	        }
		  return null;
	}

	@Override
	public void delete(long id) {
		produitRepository.deleteById(id);
		
	}

	@Override
	public List<Produit> findAll() {
		return produitRepository.findAll();
	}

	@Override
	public Produit findById(Long id) {
		return produitRepository.findById(id).get();
	}

	@Override
	public void assignProduitToStock(Long idProduit, Long idStock) {
		  Produit prod = produitRepository.findById(idProduit).get();
	        prod.setStock(stockRepository.findById(idStock).get());
	        produitRepository.save(prod);
		
	}

	@Override
	public float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate) {
		 return (float) produitRepository.getRevenuBrutProduit(idProduit, startDate, endDate) * findById(idProduit).getPrixUnitaire();
	}


}
