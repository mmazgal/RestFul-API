package com.example.AyrotekQuiz.business.abstracts;

import com.example.AyrotekQuiz.request.UserRequest;
import com.example.AyrotekQuiz.response.UserResponse;
import java.util.List;

public interface UserService {

    UserResponse addUser(UserRequest userRequest);
    UserResponse updateUser(Long id,UserRequest userRequest);
    void deleteUser(Long id);
    List<UserResponse> getAllUser();

}