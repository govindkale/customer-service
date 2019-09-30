package com.gk.customerservice.Controller;

import com.gk.customerservice.dto.Item;
import com.gk.customerservice.dto.Stock;
import com.gk.customerservice.service.stock.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {
    @Autowired
    StockService stockService;

    @PostMapping("/addStock")
    public String addStock(@RequestBody Stock c){
        stockService.addStock(c);
        return "success";
    }
    @GetMapping("/getStock")
    public @ResponseBody Stock getStock(@RequestParam int id){
        return stockService.getStock(id);
    }
    @GetMapping("/getStocks")
    public @ResponseBody List<Stock> getStocks(){
        return stockService.getAllStock();
    }
    @GetMapping("/getStockByItem")
    public @ResponseBody List<Stock> getStockByItem(@RequestParam String itemId){
        return stockService.getStockByItem(itemId);
    }



}
