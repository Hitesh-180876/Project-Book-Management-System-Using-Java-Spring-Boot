package com.project.Library.Management.Application.controller;

import com.project.Library.Management.Application.exceptions.UserNotFoundException;
import com.project.Library.Management.Application.model.User;
import com.project.Library.Management.Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class UserController {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    @Autowired
    UserService userService;


    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return userService.userlist(user);
    }

    @GetMapping("/users")
    public List<User> allUsers(){
        return userService.allUsers();
    }

    @GetMapping("/users/{id}")
    public User findUserById(@PathVariable int id) throws UserNotFoundException {
        return userService.findById(id);
    }
}
