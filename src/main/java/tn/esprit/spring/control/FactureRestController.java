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

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.service.client.IClientService;
import tn.esprit.spring.service.facture.IFactureService;
import tn.esprit.spring.service.produit.IProduitService;

@RestController
@RequestMapping("/facture")
public class FactureRestController {

	public FactureRestController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
    IFactureService ifactureService;
	
	@RequestMapping("/")
	@ResponseBody //serialisation de l’objet en json
	public String welcome() { 
		return "Bonjour, Bienvenue à l'application de test des Web Services";
	}
	
	
	@GetMapping("/findById/{id}")
	@ResponseBody
   public Facture findById(@PathVariable("id") Long id) {
       return ifactureService.findById(id);
         }
	
	@GetMapping("/listfacture")
	@ResponseBody
    public List<Facture> list() {
        return ifactureService.findAll();
          }
	
	 
	 @PostMapping("/addfacture")
	 @ResponseBody
	    public Facture add(@Valid @RequestBody Facture facture) {
	        Facture fact = ifactureService.add(facture);
	        return fact;
	    }
	 
	 @PutMapping("/update/{id}")
	 @ResponseBody
	    public Facture modify(@Valid @RequestBody Facture facture,@PathVariable("id") Long id) {
	        return ifactureService.update(facture, id);
	    }
	   @DeleteMapping("delete/{id}")
	   @ResponseBody
	    public void cancelFacture(@PathVariable("id") long id) {
		   ifactureService.cancelFacture(id);
	    }

}
