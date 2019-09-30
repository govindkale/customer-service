package com.gk.customerservice.service.Item;

import com.gk.customerservice.dto.Item;
import com.gk.customerservice.repository.Item.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;
    @Override
    public Item getItem(String itemId) {
        return itemRepository.findOne(itemId);
    }

    @Override
    @Transactional
    public void addItem(Item it) {
        itemRepository.save(it);
    }

    @Override
    public List<Item> getAllItem() {
        return itemRepository.findAll();
    }
}
