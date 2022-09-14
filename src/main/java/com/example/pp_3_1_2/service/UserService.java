package com.example.pp_3_1_2.service;





import com.example.pp_3_1_2.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getAllUsers();

    User getUserByEmail(String login);

    User getUserById(long id);
}
