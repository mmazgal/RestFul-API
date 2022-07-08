package com.example.AyrotekQuiz.response;

import com.example.AyrotekQuiz.model.User;
import lombok.Data;
import org.springframework.stereotype.Component;


@Component
@Data
public class UserResponseConverter {

    public UserResponse from(User user){
        return UserResponse.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .age(user.getAge())
                .email(user.getEmail())
                .build();
    }
}