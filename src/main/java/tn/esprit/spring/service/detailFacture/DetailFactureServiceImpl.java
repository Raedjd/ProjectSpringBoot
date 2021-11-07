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
	public DetailFacture add(DetailFacture detailFacture) {
		// TODO Auto-generated method stub
		 return detailFactureRepository.save(detailFacture);
	}

	@Override
	public DetailFacture update(DetailFacture detailFacture, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		detailFactureRepository.deleteById(id);
	}

	@Override
	public List<DetailFacture> findAll() {
		// TODO Auto-generated method stub
		return detailFactureRepository.findAll();
	}

	@Override
	public DetailFacture findById(Long id) {
		// TODO Auto-generated method stub
		return detailFactureRepository.getOne(id);
	}
}
