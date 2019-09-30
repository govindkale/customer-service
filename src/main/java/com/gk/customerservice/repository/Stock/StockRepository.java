package com.gk.customerservice.repository.Stock;

import com.gk.customerservice.dto.Item;
import com.gk.customerservice.dto.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {
    //@NamedQueries("from stock s inner join item i on s.item_item_id=i.item_id where s.item_item_id = :id")
    @Query("from Stock s where s.item.itemId = :id")
    public List<Stock> findByItemId(@Param("id") String itemId);
}
