package tn.esprit.spring.service.detailFacture;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.DetailFacture;
@Service
public interface IDetailFactureService {
	    DetailFacture add(DetailFacture detailFacture);
	    DetailFacture update(DetailFacture detailFacture, Long id);
	    void delete(long id);
	    List<DetailFacture> findAll();
	    DetailFacture findById(Long id);
}
