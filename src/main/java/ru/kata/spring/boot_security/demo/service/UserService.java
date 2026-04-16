package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User findByUsername(String username);
}