package org.example.service;

import org.example.dao.RestaurantDao;
import org.example.model.Restaurant;

public class RestaurantService {
RestaurantDao restaurantDao = new RestaurantDao();
    public void createRestaurant(Restaurant restaurant) {
            RestaurantDao.createRestaurant(restaurant);
    }

    public void deleteRestaurant(Restaurant restaurant) {
        RestaurantDao.deleteRestaurant(restaurant);
    }

    public void getRestaurantById(Restaurant restaurantid) {
        RestaurantDao.getRestaurantById(restaurantid);
    }
}
