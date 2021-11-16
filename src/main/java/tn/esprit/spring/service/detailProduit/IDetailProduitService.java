package tn.esprit.spring.service.detailProduit;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.DetailProduit;

public interface IDetailProduitService {

	    DetailProduit addDetailProduit(DetailProduit dp);
	    DetailProduit updateDetailProduit(DetailProduit dp,Long id);
	
}
