package tn.esprit.spring.control;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.service.client.ClientServiceImpl;
import tn.esprit.spring.service.client.IClientService;

@RestController
@RequestMapping("/client")
@Slf4j
public class ClientRestController {

	public ClientRestController() {
		// TODO Auto-generated constructor stub
	}
       
	@Autowired
     IClientService iclientService;
	
	@RequestMapping("/")
	@ResponseBody //serialisation de l’objet en json
	public String welcome() { 
		return "Bonjour, Bienvenue à l'application de test des Web Services";
	}
	
	
	@GetMapping("/findById/{id}")
	@ResponseBody
    public Client findById(@PathVariable("id") Long id) {
        return iclientService.findById(id);
          }
	
	@GetMapping("/list")
	@ResponseBody
    public List<Client> list() {
        return iclientService.findAll();
          }
	
	
	 @PostMapping("/addclient")
	 @ResponseBody
	    public Client add(@Valid @RequestBody Client client) {
	        Client c = iclientService.add(client);
	         return c;
	        
	    }
	 
	 @PutMapping("/update/{id}")
	 @ResponseBody
	    public Client modify(@Valid @RequestBody Client client,@PathVariable("id") Long id) {
	        return iclientService.update(client, id);
	    }
	   @DeleteMapping("delete/{id}")
	   @ResponseBody
	    public void delete(@PathVariable("id") long id) {
	        iclientService.delete(id);
	    }
}