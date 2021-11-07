package tn.esprit.spring.service.stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.repository.StockRepository;
@Service
public class StockServiceImpl implements IStockService {
     
	 @Autowired
	    private StockRepository stockRepository;
	@Override
	public Stock add(Stock stock) {
		// TODO Auto-generated method stub
		return stockRepository.save(stock);
	}

	@Override
	public Stock update(Stock stock, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		stockRepository.deleteById(id);
	}

	@Override
	public List<Stock> findAll() {
		// TODO Auto-generated method stub
		return stockRepository.findAll();
	}

	@Override
	public Stock findById(Long id) {
		// TODO Auto-generated method stub
		return stockRepository.getOne(id);
	}

}
