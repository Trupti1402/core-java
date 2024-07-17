package org.example.Controller;

import org.example.model.Item;
import org.example.service.ItemSevice;

public class ItemController {
    ItemSevice itemSevice = new ItemSevice();
    public void createItem(Item item) {
         itemSevice.createItem(item);
    }

    public void deleteItem(Item item){
        itemSevice.deleteItem(item);
    }

    public void getAllItem(Item item){
        itemSevice.getAllItem(item);
    }
}
