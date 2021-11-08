package tn.esprit.spring;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entity.CategorieClient;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Profession;
import tn.esprit.spring.service.client.IClientService;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ClientServiceImplTest {
	@Autowired
    private IClientService iclientService;
	
	   @Test
	    public void testAddClient() throws ParseException {
	        List<Client> clients = iclientService.findAll();
	        int expected = clients.size();
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        Date dateNais= dateFormat.parse("07/11/1996");
	        Client client = new Client("RAED", "JAIDI",dateNais, "raed.jaidi@esprit.tn", "000000", CategorieClient.Fidele,Profession.Ingenieur);
	        Client savedClient = iclientService.add(client);
	        assertEquals(expected + 1, iclientService.findAll().size());
	        assertNotNull(savedClient.getNom());
	        iclientService.delete(savedClient.getIdClient());
	    }
	   @Test
	    public void testListClient() {
	        iclientService.findAll()
	                .forEach( client -> log.info("Client :"+ client));
	    }
}
