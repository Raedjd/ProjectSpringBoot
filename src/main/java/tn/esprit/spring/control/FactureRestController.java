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
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.service.client.IClientService;
import tn.esprit.spring.service.produit.IProduitService;

@RestController
@RequestMapping("/facture")
public class FactureRestController {

	public FactureRestController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
    IProduitService iproduitService;
	
	@RequestMapping("/")
	@ResponseBody //serialisation de l’objet en json
	public String welcome() { 
		return "Bonjour, Bienvenue à l'application de test des Web Services";
	}
	
	
	@GetMapping("/findById/{id}")
	@ResponseBody
   public Produit findById(@PathVariable("id") Long id) {
       return iproduitService.findById(id);
         }
	
	
	 @PostMapping("/addClient")
	 @ResponseBody
	    public Produit add(@Valid @RequestBody Produit produit) {
	        Produit prod = iproduitService.add(produit);
	        return prod;
	    }
	 
	 @PutMapping("/update/{id}")
	 @ResponseBody
	    public Produit modify(@Valid @RequestBody Produit produit,@PathVariable("id") Long id) {
	        return iproduitService.update(produit, id);
	    }
	   @DeleteMapping("delete/{id}")
	   @ResponseBody
	    public void delete(@PathVariable("id") long id) {
		   iproduitService.delete(id);
	    }

}
