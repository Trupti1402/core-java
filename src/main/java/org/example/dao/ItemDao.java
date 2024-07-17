package org.example.dao;

import org.example.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDao {
    public  static List<Item> itemList= new ArrayList<>();

    public static void createItem(Item item) {
        itemList.add(item);
    }

    public static void deleteItem(Item item) {
        itemList.remove(item);
    }

    public static void getAllItem(Item item) {
      return itemList.getAll(item);

    }
}
