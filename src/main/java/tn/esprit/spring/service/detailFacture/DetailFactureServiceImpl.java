package tn.esprit.spring.service.detailFacture;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.DetailFacture;
import tn.esprit.spring.repository.DetailFactureRepository;

@Service
public class DetailFactureServiceImpl implements IDetailFactureService {

	@Autowired
    private DetailFactureRepository detailFactureRepository;

	@Override
	public DetailFacture addDetailFacture(DetailFacture df) {
		return detailFactureRepository.save(df);
	}

	@Override
	public void deleteDetailFacture(Long id) {
		 detailFactureRepository.deleteById(id);
		
	}

}
