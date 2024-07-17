package org.example.dao;

import org.example.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantDao {
    public static List<Restaurant> restaurantList= new ArrayList<>();
    public static void createRestaurant(Restaurant restaurant) {
       restaurantList.add(restaurant);
    }

    public static void deleteRestaurant(Restaurant restaurant) {
      restaurantList.remove(restaurant);
    }

    public static void getRestaurantById(Restaurant restaurantid) {
        restaurantList.get(restaurantid);
    }
}
