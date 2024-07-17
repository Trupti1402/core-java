package org.example.Controller;

import org.example.model.Restaurant;
import org.example.service.RestaurantService;

public class RestaurantController {
    RestaurantService restaurantService= new RestaurantService();
    public void createRestaurant(Restaurant restaurant){
        restaurantService.createRestaurant(restaurant);
    }
   public void deleteRestaurant (Restaurant restaurant){
        restaurantService.deleteRestaurant(restaurant);
   }
   public void getRestaurantById(Restaurant restaurantid){
       restaurantService.getRestaurantById(restaurantid);
   }
}
