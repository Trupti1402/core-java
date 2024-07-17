package org.example.Controller;
import org.example.model.Order;
import org.example.service.OrderService;

public class OrderController {

    OrderService orderService = new OrderService();
    public void createOrder(Order order) {
        orderService.createOrder(order);
    }
    public void deleteOrder(Order order) {
        orderService.deleteOrder(order);
    }
    public void getAllOrder(Order order) {
        orderService.getAllOrder(order);
    }
}
