package com.gk.customerservice.repository.Item;

import com.gk.customerservice.dto.Customer;
import com.gk.customerservice.dto.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {
}
