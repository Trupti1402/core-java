package org.example.dao;

import org.example.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderDao {
    public static List<Order> orderList=new ArrayList<>();

    public void addOrder(Order order) {
         orderList.add(order);
    }

    public static void deleteOrder(Order order) {
        orderList.remove(order);
    }

    public static void getAllOrder(Order order) {
      return orderList.getAll(order);
    }
}
