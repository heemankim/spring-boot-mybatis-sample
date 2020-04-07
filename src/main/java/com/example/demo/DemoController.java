package com.example.demo;

import com.example.demo.sample.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class DemoController {
    private UserService userService;
    public DemoController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<HashMap<String, Object>> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/usersDao")
    public List<HashMap<String, Object>> getUsersDao() {
        return userService.getUsersWithDao();
    }
}
