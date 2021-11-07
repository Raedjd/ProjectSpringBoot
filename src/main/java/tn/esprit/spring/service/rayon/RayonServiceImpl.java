package tn.esprit.spring.service.rayon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.repository.RayonRepository;

@Service
public class RayonServiceImpl implements IRayonService {
     
	@Autowired
    private RayonRepository rayonRepository;
	
	@Override
	public Rayon add(Rayon rayon) {
		// TODO Auto-generated method stub
		return rayonRepository.save(rayon);
	}

	@Override
	public Rayon update(Rayon rayon, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		rayonRepository.deleteById(id);
	}

	@Override
	public List<Rayon> findAll() {
		// TODO Auto-generated method stub
		return rayonRepository.findAll();
	}

	@Override
	public Rayon findById(Long id) {
		// TODO Auto-generated method stub
		return rayonRepository.getOne(id);
	}

	
}
