package tn.esprit.spring.control;

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

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Fournisseur;
import tn.esprit.spring.service.client.IClientService;
import tn.esprit.spring.service.fournisseur.IFournisseurService;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurRestController {

	public FournisseurRestController() {
		// TODO Auto-generated constructor stub
	}
	
	  
		@Autowired
	     IFournisseurService ifournisseurService;
		
		@RequestMapping("/")
		@ResponseBody //serialisation de l’objet en json
		public String welcome() { 
			return "Bonjour, Bienvenue à l'application de test des Web Services";
		}
		
		
		@GetMapping("/findById/{id}")
		@ResponseBody
	    public Fournisseur findById(@PathVariable("id") Long id) {
	        return ifournisseurService.findById(id);
	          }
		
		
		 @PostMapping("/addClient")
		 @ResponseBody
		    public Fournisseur add(@Valid @RequestBody Fournisseur fournisseur) {
			 Fournisseur fourn = ifournisseurService.add(fournisseur);
		        return fourn;
		    }
		 
		 @PutMapping("/update/{id}")
		 @ResponseBody
		    public Fournisseur modify(@Valid @RequestBody Fournisseur fournisseur,@PathVariable("id") Long id) {
		        return ifournisseurService.update(fournisseur, id);
		    }
		   @DeleteMapping("delete/{id}")
		   @ResponseBody
		    public void delete(@PathVariable("id") long id) {
			   ifournisseurService.delete(id);
		    }

}
