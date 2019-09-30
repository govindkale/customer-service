package com.gk.customerservice.Controller;

import com.gk.customerservice.dto.Customer;
import com.gk.customerservice.dto.Item;
import com.gk.customerservice.service.Customer.CustomerService;
import com.gk.customerservice.service.Item.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    ItemService itemService;

    @PostMapping("/addItem")
    public String addItem(@RequestBody Item c){
        itemService.addItem(c);
        return "success";
    }
    @GetMapping("/getItem")
    public @ResponseBody Item getItem(@RequestParam String id){
        return itemService.getItem(id);
    }

    @GetMapping("/getItems")
    public List<Item> getItems(){
       /* Item c=new Item();
        c.setItemId("pk");
        c.setItemName("payal");
        ItemService.addItem(c);*/
        return itemService.getAllItem();
    }



}
