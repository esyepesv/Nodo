package com.example.conexionsql.controllers;

import com.example.conexionsql.dtos.UserDto;
import com.example.conexionsql.models.Users;
import com.example.conexionsql.repositories.UserRepository;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody UserDto user){
        Users newuser = new Users();

        newuser.setName(user.getName());
        newuser.setEmail(user.getEmail());
        newuser.setPassword(user.getPassword());

        userRepository.save(newuser);

        return new ResponseEntity(newuser, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity getAllUsers(){
        var allUsers = userRepository.findAll();
        return new ResponseEntity(allUsers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable Long id){
        Users user = userRepository.findById(id).orElse(new Users());
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @GetMapping("/findByName")
    public ResponseEntity getByName(@RequestParam("name") String name){
        Users user = userRepository.findByName(name).orElse(new Users());
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @PutMapping("/update/{id}/user")
    public ResponseEntity updateUser(@PathVariable Long id, @RequestBody UserDto user){
        boolean exist = userRepository.existsById(id);
        if(exist){
            Users foundUser = userRepository.findById(id).orElse(new Users());
            foundUser.setName(user.getName());
            foundUser.setEmail(user.getEmail());
            foundUser.setPassword(user.getPassword());

            userRepository.save(foundUser);

            return new ResponseEntity(foundUser, HttpStatus.OK);
        }
        return new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id){
        boolean exist = userRepository.existsById(id);
        if(exist){
            userRepository.deleteById(id);
            return new ResponseEntity("Deleted", HttpStatus.OK);
        }
        return new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND);
    }

}

