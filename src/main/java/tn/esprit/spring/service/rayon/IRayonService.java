package tn.esprit.spring.service.rayon;
 
import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Rayon;
@Service
public interface IRayonService {
    
	Rayon add(Rayon rayon);
    Rayon update(Rayon rayon, Long id);
    void delete(long id);
    List<Rayon> findAll();
    Rayon findById(Long id);
}
