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
import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.service.produit.IProduitService;
import tn.esprit.spring.service.rayon.IRayonService;

@RestController
@RequestMapping("/rayon")
public class RayonRestController {

	public RayonRestController() {
		// TODO Auto-generated constructor stub
	}
	

	@Autowired
    IRayonService iRayonService;
	
	@RequestMapping("/")
	@ResponseBody //serialisation de l’objet en json
	public String welcome() { 
		return "Bonjour, Bienvenue à l'application de test des Web Services";
	}
	
	@GetMapping("/findById/{id}")
	@ResponseBody
    public Rayon findById(@PathVariable("id") Long id) {
        return iRayonService.findById(id);
          } 
	
	 @PostMapping("/addrayon")
	 @ResponseBody
	    public Rayon add(@Valid @RequestBody Rayon rayon) {
		 Rayon ray= iRayonService.add(rayon);
	        return ray;
	    }
	 
	 @PutMapping("/update/{id}")
	 @ResponseBody
	    public Rayon modify(@Valid @RequestBody Rayon rayon,@PathVariable("id") Long id) {
	        return iRayonService.update(rayon, id);
	    }
	   @DeleteMapping("delete/{id}")
	   @ResponseBody
	    public void delete(@PathVariable("id") long id) {
		   iRayonService.delete(id);
	    }


}
