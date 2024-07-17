package org.example;

import org.example.Controller.UserController;
import org.example.model.User;

import static org.example.dao.UserDao.userList;

public class App {
    public static void main(String[] args) {

        User user1 = User.builder()
                .user_id(1)
                .user_name("Trupti")
                .user_address("Pune")
                .user_phone("9087654321")
                .build();

        User user2 = User.builder()
                .user_id(2)
                .user_name("Trups")
                .user_address("karad")
                .user_phone("3456789987")
                .build();

        User user3 = User.builder()
                .user_id(2)
                .user_name("Rutu")
                .user_address("Mumbai")
                .user_phone("8776354321")
                .build();

       /* UserController userController= new UserController();
        userController.createUser(user1);
        System.out.println(user1);*/

     /*   userController.createUser(user2);
        System.out.println(user2);

        userController.createUser(user3);
        System.out.println(user3);*/


        for (User user : userList) {
            System.out.println("user Id: " + user.getId());
            System.out.println("user Name: " + user.getName());
            System.out.println("user Address: " + user.getAddress());
            System.out.println("user Phone: " + user.getPhone());
        }
    }
}