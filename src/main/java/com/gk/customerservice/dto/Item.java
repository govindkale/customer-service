package com.gk.customerservice.dto;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ITEM")
public class Item implements Serializable {
    @Id
    @Column(name = "item_id")
    String itemId;
    @Column(name = "item_name")
    String itemName;

    @Column(name = "item_desc")
    String itemDescription;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}
