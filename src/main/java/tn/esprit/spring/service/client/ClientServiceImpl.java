package tn.esprit.spring.service.client;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.repository.ClientRepository;

@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	private ClientRepository  clientRepository ;

	@Override
	public Client add(Client client) {
		// TODO Auto-generated method stub
		return clientRepository.save(client);

	}

	@Override
	public Client update(Client client, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		clientRepository.deleteById(id);
		
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
