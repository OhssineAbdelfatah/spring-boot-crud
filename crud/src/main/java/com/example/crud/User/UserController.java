package com.example.crud.User;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<UserCrud> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public UserCrud getUserById(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }

    @PostMapping
    public UserCrud createUser(@RequestBody UserCrud user) {
        return userRepository.save(user);
    }
    
    @PutMapping("/{id}")
    public UserCrud updateUser(@PathVariable Long id ,@RequestBody UserCrud user) {
        UserCrud existUser  = userRepository.findById(id).get();
        existUser.setName(user.getName()); 
        existUser.setEmail(user.getEmail()); 
        return userRepository.save(existUser);
    }

    
}
