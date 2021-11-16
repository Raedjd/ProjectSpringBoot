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
import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.service.rayon.IRayonService;
import tn.esprit.spring.service.stock.IStockService;

@RestController
@RequestMapping("/stock")
public class StockRestController {

	public StockRestController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
    IStockService iStockService;
	
	@RequestMapping("/")
	@ResponseBody //serialisation de l’objet en json
	public String welcome() { 
		return "Bonjour, Bienvenue à l'application de test des Web Services";
	}
	
	@GetMapping("/findById/{id}")
	@ResponseBody
    public Stock findById(@PathVariable("id") Long id) {
        return iStockService.findById(id);
          }
	@GetMapping("/liststock")
	@ResponseBody
    public List<Stock> list() {
        return iStockService.findAll();
          }
	 @PostMapping("/addstock")
	 @ResponseBody
	    public Stock  add(@Valid @RequestBody Stock  stock) {
		 Stock  stoc= iStockService.add(stock);
	        return stoc;
	    }
	 
	 @PutMapping("/update/{id}")
	 @ResponseBody
	    public Stock  modify(@Valid @RequestBody Stock  stock,@PathVariable("id") Long id) {
	        return iStockService.update(stock, id);
	    }
	   @DeleteMapping("delete/{id}")
	   @ResponseBody
	    public void delete(@PathVariable("id") long id) {
		   iStockService.delete(id);
	    }



}
