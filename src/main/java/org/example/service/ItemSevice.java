package org.example.service;

import org.example.dao.ItemDao;
import org.example.model.Item;

public class ItemSevice {
    public void createItem(Item item) {
        ItemDao.createItem(item);
    }

    public void deleteItem(Item item) {
        ItemDao.deleteItem(item);
    }

    public void getAllItem(Item item) {
        ItemDao.getAllItem(item);
    }
}