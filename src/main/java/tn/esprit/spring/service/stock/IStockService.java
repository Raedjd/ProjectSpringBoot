package tn.esprit.spring.service.stock;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Stock;

@Service
public interface IStockService {
   
	Stock add(Stock stock);
    Stock update(Stock stock, Long id);
    void delete(long id);
    List<Stock> findAll();
    Stock findById(Long id);
}
