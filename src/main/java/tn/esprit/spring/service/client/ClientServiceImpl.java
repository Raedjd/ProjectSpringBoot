package tn.esprit.spring.service.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.repository.ClientRepository;
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
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		 return clientRepository.findAll();
	}

	@Override
	public Client findById(Long id) {
		// TODO Auto-generated method stub
		 return clientRepository.getOne(id);
	}
}
