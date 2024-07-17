package org.example.service;

import org.example.dao.OrderDao;
import org.example.model.Order;

public class OrderService {
     OrderDao orderDao=new OrderDao();
    public void createOrder(Order order) {
       orderDao.addOrder(order);
    }

    public void deleteOrder(Order order) {
        OrderDao.deleteOrder(order);
    }

    public void getAllOrder(Order order) {
        OrderDao.getAllOrder(order);
    }
}
