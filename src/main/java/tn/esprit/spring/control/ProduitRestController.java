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

import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.service.produit.IProduitService;


@RestController
@RequestMapping("/produit")
public class ProduitRestController {

	public ProduitRestController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
    IProduitService iProduitService;
	
	@RequestMapping("/")
	@ResponseBody //serialisation de l’objet en json
	public String welcome() { 
		return "Bonjour, Bienvenue à l'application de test des Web Services";
	}
	
	@GetMapping("/findById/{id}")
	@ResponseBody
    public Produit findById(@PathVariable("id") Long id) {
        return iProduitService.findById(id);
          }
	
	 @PostMapping("/addproduit")
	 @ResponseBody
	    public Produit add(@Valid @RequestBody Produit produit) {
		 Produit prod = iProduitService.add(produit);
	        return prod;
	    }
	  
	 @PutMapping("/update/{id}")
	 @ResponseBody
	    public Produit modify(@Valid @RequestBody Produit produit,@PathVariable("id") Long id) {
	        return iProduitService.update(produit, id);
	    }
	   @DeleteMapping("delete/{id}")
	   @ResponseBody
	    public void delete(@PathVariable("id") long id) {
		   iProduitService.delete(id);
	    }

}
