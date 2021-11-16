package tn.esprit.spring.service.detailProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.DetailProduit;

import tn.esprit.spring.repository.DetailProduitRepository;
@Service
public class DetailProduitServiceImpl  implements IDetailProduitService  {
	
	@Autowired
    private DetailProduitRepository detailProduitRepository;

	@Override
	public DetailProduit addDetailProduit(DetailProduit dp) {
		return detailProduitRepository.save(dp);
	}

	@Override
	public DetailProduit updateDetailProduit(DetailProduit dp, Long id) {
		   if(detailProduitRepository.findById(id).isPresent()){
			     DetailProduit detprod = detailProduitRepository.findById(id).get();
			     detprod.setDateCreation(dp.getDateCreation());
			     detprod.setDateDerniereModification(dp.getDateDerniereModification());
			     detprod.setCategorieProduit(dp.getCategorieProduit());
	             return detailProduitRepository.save(detprod);
	        }
	        return null;
	    }
		


	
}
