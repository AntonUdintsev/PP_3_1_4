package com.example.pp_3_1_2.dao;



import com.example.pp_3_1_2.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getUsers();
    public void addUser (User user);
    public  User showUser (int id);
    public void updateUser (int id, User user);
    public void deleteUser (int id);
    public User findByName (String name);

}
