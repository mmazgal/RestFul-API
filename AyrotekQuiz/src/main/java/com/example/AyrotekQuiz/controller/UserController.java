package com.example.AyrotekQuiz.controller;

import com.example.AyrotekQuiz.business.abstracts.UserService;
import com.example.AyrotekQuiz.request.UserRequest;
import com.example.AyrotekQuiz.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserResponse> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse addUser(@RequestBody UserRequest userRequest){
        return userService.addUser(userRequest);
    }

    @PutMapping("/{id}")
    public UserResponse updateUser(@PathVariable Long id, @RequestBody UserRequest userRequest){
        return userService.updateUser(id,userRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
         userService.deleteUser(id);
    }

}