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

import tn.esprit.spring.entity.DetailFacture;
import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.service.detailFacture.IDetailFactureService;
import tn.esprit.spring.service.detailProduit.IDetailProduitService;

@RestController
@RequestMapping("/detailproduit")
public class DetailProduitRestController {

	public DetailProduitRestController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
    IDetailProduitService idetailProduitService;
	
	@RequestMapping("/")
	@ResponseBody //serialisation de l’objet en json
	public String welcome() { 
		return "Bonjour, Bienvenue à l'application de test des Web Services";
	}
	
	@GetMapping("/findById/{id}")
	@ResponseBody
    public DetailProduit findById(@PathVariable("id") Long id) {
        return idetailProduitService.findById(id);
          }
	
	 @PostMapping("/adddetproduit")
	 @ResponseBody
	    public DetailProduit add(@Valid @RequestBody DetailProduit detproduit) {
		 DetailProduit detprod = idetailProduitService.add(detproduit);
	        return detprod;
	    }
	 
	 @PutMapping("/update/{id}")
	 @ResponseBody
	    public DetailProduit modify(@Valid @RequestBody DetailProduit detproduit,@PathVariable("id") Long id) {
	        return idetailProduitService.update(detproduit, id);
	    }
	   @DeleteMapping("delete/{id}")
	   @ResponseBody
	    public void delete(@PathVariable("id") long id) {
		   idetailProduitService.delete(id);
	    }

}
