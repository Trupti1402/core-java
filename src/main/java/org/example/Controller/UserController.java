package org.example.Controller;

import org.example.model.User;
import org.example.service.UserService;



public class UserController {
       UserService userService = new UserService();

    public  void createUser(User user) {

        userService.createUser(user);
    }
    public  void deleteUser(User user) {
        userService.deleteUser(user);
    }
    public User getUserById(int userid) {
       return userService.getUserById(userid);
    }
}
