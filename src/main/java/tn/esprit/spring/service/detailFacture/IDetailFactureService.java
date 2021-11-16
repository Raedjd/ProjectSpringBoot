package tn.esprit.spring.service.detailFacture;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.DetailFacture;
@Service
public interface IDetailFactureService {
	DetailFacture addDetailFacture(DetailFacture df);
    void deleteDetailFacture(Long id);
}
