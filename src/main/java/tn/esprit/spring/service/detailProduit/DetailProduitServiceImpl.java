package tn.esprit.spring.service.detailProduit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.repository.DetailProduitRepository;

public class DetailProduitServiceImpl  implements IDetailProduitService  {
	
	@Autowired
    private DetailProduitRepository detailProduitRepository;

	@Override
	public DetailProduit add(DetailProduit detailProduit) {
		// TODO Auto-generated method stub
		return detailProduitRepository.save(detailProduit);
	}

	@Override
	public DetailProduit update(DetailProduit detailProduit, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		detailProduitRepository.deleteById(id);
		
	}

	@Override
	public List<DetailProduit> findAll() {
		// TODO Auto-generated method stub
		return detailProduitRepository.findAll();
	}

	@Override
	public DetailProduit findById(Long id) {
		// TODO Auto-generated method stub
		return detailProduitRepository.getOne(id);
	}

}
