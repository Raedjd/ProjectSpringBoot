package tn.esprit.spring.service.client;
 
import java.util.Date;
import java.util.List;

import tn.esprit.spring.entity.CategorieClient;
import tn.esprit.spring.entity.Client;

public interface IClientService {
	
	    Client add(Client client);
	    Client update(Client client, Long id);
	    void delete(long id);
	    List<Client> findAll();
	    Client findById(Long id);
	    float getChiffreAffaireParCategorieClient(CategorieClient categorieClient, Date startDate, Date endDate);
}
