package com.example.spring_boot_jwt.service;

import com.example.spring_boot_jwt.authen.UserPrincipal;
import com.example.spring_boot_jwt.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
