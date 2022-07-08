package com.example.AyrotekQuiz.response;

import com.example.AyrotekQuiz.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponse {
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;

 
}

