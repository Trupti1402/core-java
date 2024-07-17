package org.example.dao;

import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public static List<User> userList = new ArrayList<>();

    public void createUser(User user) {
        userList.add(user);
    }

    public void deleteUser(User user) {
        userList.remove(user);
    }

    public User getUserById(int userid) {
        return null;
    }
}


