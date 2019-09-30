package com.gk.customerservice.Controller;

import com.gk.customerservice.dto.Customer;
import com.gk.customerservice.dto.Item;
import com.gk.customerservice.dto.Stock;
import com.gk.customerservice.service.Customer.CustomerService;
import com.gk.customerservice.service.Item.ItemService;
import com.gk.customerservice.service.stock.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    ItemService itemService;
    @Autowired
    StockService stockService;

    @PostMapping("/addCustomer")
    public String addCustomer(@RequestBody Customer c){
        customerService.addCustomer(c);
        return "success";
    }
    @GetMapping("/getCustomer")
    public @ResponseBody Customer getCustomer(@RequestParam String id){
        return customerService.getCustomer(id);
    }

    @GetMapping("/getCustomers")
    public List<Customer> getCustomers(){
       /* Customer c=new Customer();
        c.setCustomerId("pk");
        c.setCustomerName("payal");
        customerService.addCustomer(c);*/
        return customerService.getAllCustomer();
    }
    @GetMapping("/addDummyData")
    public String addDummyData(){
        Customer c=new Customer();
        c.setCustomerId("pk");
        c.setCustomerName("payal");
        customerService.addCustomer(c);

        Item i=new Item();
        i.setItemId("mobile");
        i.setItemDescription("mobile");
        i.setItemName("mobile");
        itemService.addItem(i);

        Stock s=new Stock();
        s.setItem(i);
        s.setStockAmount(100);
        s.setStockUnit("number");
        stockService.addStock(s);

        return "success";
    }



}
