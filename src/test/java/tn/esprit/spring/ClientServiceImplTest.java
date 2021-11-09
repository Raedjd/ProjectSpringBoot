
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
    IClientService iclientService;
	
	   @Test
	    public void testAdd() throws ParseException {
	    //    List<Client> clients = iclientService.findAll();
	     
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        Date dateNais= dateFormat.parse("07/11/1996");
	        Client client = new Client("RAED", "JAIDI",dateNais, "raed.jaidi@esprit.tn", "000000", CategorieClient.Fidele, Profession.Ingenieur);
	        Client savedClient = iclientService.add(client);
	   
	       assertNotNull(savedClient.getIdClient());
	       assertNotNull(savedClient.getDateNaissance());
	       assertTrue(savedClient.getNom().length() >0);
	       iclientService.delete(savedClient.getIdClient()); //for best practice
	    }
	 
}
