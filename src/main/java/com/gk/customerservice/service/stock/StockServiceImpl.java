package com.gk.customerservice.service.stock;

import com.gk.customerservice.dto.Stock;
import com.gk.customerservice.repository.Stock.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class StockServiceImpl implements StockService{
    @Autowired
    private StockRepository stockRepository;
    @Override
    public Stock getStock(int stockId) {
        return stockRepository.findOne(stockId);
    }

    @Override
    @Transactional
    public void addStock(Stock st) {
        stockRepository.save(st);
    }

    @Override
    @Transactional
    public void updateStock(Stock st) {
        stockRepository.save(st);
    }

    @Override
    public List<Stock> getAllStock() {
        return stockRepository.findAll();
    }

    @Override
    public List<Stock> getStockByItem(String itemId) {

        return stockRepository.findByItemId(itemId);
    }
}
