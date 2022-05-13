package com.project.Library.Management.Application.service;

import com.project.Library.Management.Application.exceptions.UserNotFoundException;
import com.project.Library.Management.Application.model.User;
import com.project.Library.Management.Application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

public class UserService {

    @Autowired
    UserRepository userRepository;


    public User userlist(@RequestBody User user){
       User user1 =  userRepository.save(user);
       return user1;
    }

    public List<User> allUsers(){
        return userRepository.findAll();
    }

    public User findById(@PathVariable int id) throws UserNotFoundException {
        return userRepository.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }
}
