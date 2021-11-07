package tn.esprit.spring.service.detailProduit;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.DetailProduit;


@Service
public interface IDetailProduitService {

	    DetailProduit add(DetailProduit detailProduit);
	    DetailProduit update(DetailProduit detailProduit, Long id);
	    void delete(long id);
	    List<DetailProduit> findAll();
	    DetailProduit findById(Long id);
}
