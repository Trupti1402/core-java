package org.example.service;

import org.example.dao.UserDao;
import org.example.model.User;

public class UserService {
    UserDao userDao = new UserDao();

    public void createUser(User user) {
        userDao.createUser(user);
    }

    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }

    public User getUserById(int userid) {
        return userDao.getUserById(userid);
    }
}
