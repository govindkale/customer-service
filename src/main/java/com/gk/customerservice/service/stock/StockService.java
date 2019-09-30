package com.gk.customerservice.service.stock;

import com.gk.customerservice.dto.Stock;

import java.util.List;

public interface StockService {
    public Stock getStock(int stockId);
    public void addStock(Stock st);
    public void updateStock(Stock st);
    public List<Stock> getAllStock();
    public List<Stock> getStockByItem(String itemId);

}
