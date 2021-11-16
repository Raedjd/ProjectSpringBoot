package tn.esprit.spring.service.client;
 
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.CategorieClient;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class ClientServiceImpl implements IClientService {

	@Autowired
	private ClientRepository  clientRepository ;

	@Override
	public Client add(Client client) { 
		log.info("In methode addClient");
		return clientRepository.save(client);
		
	}
 
	@Override
	public Client update(Client client, Long id) {
		
		   if(clientRepository.findById(id).isPresent()){
	            Client clt = clientRepository.findById(id).get();
	            clt.setNom(client.getNom());
	            clt.setPrenom(client.getPrenom());
	            clt.setEmail(client.getEmail());
	            clt.setPassword(client.getPassword());
	            clt.setDateNaissance(client.getDateNaissance());
	            clt.setProfesion(client.getProfesion());
	            clt.setCategorieClient(client.getCategorieClient());
	            clt.setFactures(client.getFactures());
	            return clientRepository.save(clt);
	        }
		return null;
	}

	@Override
	public void delete(long id) {
		log.info("In methode deleteClient");
	    log.warn("Attendion! vous etes en train de supprimer un client");
		clientRepository.deleteById(id);
		log.error("Exeption!");
	}

	@Override
	public List<Client> findAll() {
		
		 return clientRepository.findAll();
	}

	@Override
	public Client findById(Long id) {
	
		 return clientRepository.findById(id).get();
	}
    
	@Override
	public float getChiffreAffaireParCategorieClient(CategorieClient categorieClient, Date startDate, Date endDate) {
		 return (float) clientRepository.findAllByCategorieClient(categorieClient).stream().mapToDouble(client -> client.getFactures()
	                        .stream().filter(facture -> facture.getDateFacture().after(startDate) && facture.getDateFacture().before(endDate))
	                        .mapToDouble(Facture::getMontantFacture).sum())
	                        .sum();
	}
}
