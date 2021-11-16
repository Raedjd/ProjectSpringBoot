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
import tn.esprit.spring.entity.DetailFacture;
import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.service.detailFacture.IDetailFactureService;

@RestController
@RequestMapping("/detailfacture")
public class DetailFactureRestController {

	public DetailFactureRestController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired 
    IDetailFactureService idetailFactureService;
	
	@RequestMapping("/")
	@ResponseBody //serialisation de l’objet en json
	public String welcome() { 
		return "Bonjour, Bienvenue à l'application de test des Web Services";
	}
	

	 @PostMapping("/adddetfacture")
	 @ResponseBody
	    public DetailFacture addDetailFacture(@Valid @RequestBody DetailFacture detfacture) {
		 DetailFacture dfacture = idetailFactureService.addDetailFacture(detfacture);
	        return dfacture;
	    }
	 
	 @DeleteMapping("delete/{id}")
	   @ResponseBody
	    public void deleteDetailFacture(@PathVariable("id") long id) {
		 idetailFactureService.deleteDetailFacture(id);
	         
	    }
	

}
