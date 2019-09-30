package com.gk.customerservice.service.Item;

import com.gk.customerservice.dto.Item;

import java.util.List;

public interface ItemService {
    public Item getItem(String itemId);
    public void addItem(Item it);
    public List<Item> getAllItem();

}
