package com.jshdevco.login.service;

import com.jshdevco.login.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
