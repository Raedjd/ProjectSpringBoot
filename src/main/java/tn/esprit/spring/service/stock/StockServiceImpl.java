package tn.esprit.spring.service.stock;
        
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.repository.ProduitRepository;
import tn.esprit.spring.repository.StockRepository;
@Service
public class StockServiceImpl implements IStockService {
     
	 @Autowired
	    private StockRepository stockRepository;
	 @Autowired
	    private ProduitRepository produitRepository;

	@Override
	public Stock add(Stock stock) {
		return stockRepository.save(stock);
	}

	@Override
	public Stock update(Stock stock, Long id) {
		if(stockRepository.findById(id).isPresent()){
            Stock st = stockRepository.findById(id).get();
            st.setQte(stock.getQte());
            st.setQteMin(stock.getQteMin());
            st.setLibelleStock(stock.getLibelleStock());
            return stockRepository.save(st);
	}
		return null;
	}

	@Override
	public void delete(long id) {
		stockRepository.deleteById(id);
		
	}

	@Override
	public List<Stock> findAll() {
		return stockRepository.findAll();
	}

	@Override
	public Stock findById(Long id) {
		 return stockRepository.findById(id).get();
	}



}
	

