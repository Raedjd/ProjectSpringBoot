package tn.esprit.spring.service.rayon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.repository.RayonRepository;

@Service
public class RayonServiceImpl implements IRayonService {
     
	@Autowired
    private RayonRepository rayonRepository;
	
	@Override
	public Rayon add(Rayon rayon) {
		return rayonRepository.save(rayon);
	}

	@Override
	public Rayon update(Rayon rayon, Long id) {
		if(rayonRepository.findById(id).isPresent()){
            Rayon ray = rayonRepository.findById(id).get();
            ray.setCode(rayon.getCode());
            ray.setLibelle(rayon.getLibelle());
	            return rayonRepository.save(ray);
	        }
		  return null;
	}

	@Override
	public void delete(long id) {
		rayonRepository.deleteById(id);
	}

	@Override
	public List<Rayon> findAll() {
		return rayonRepository.findAll();
	}

	@Override
	public Rayon findById(Long id) {
				return rayonRepository.findById(id).get();
	}

	
}
