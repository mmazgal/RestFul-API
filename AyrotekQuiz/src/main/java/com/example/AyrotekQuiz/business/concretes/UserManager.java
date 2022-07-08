package com.example.AyrotekQuiz.business.concretes;

import com.example.AyrotekQuiz.business.abstracts.UserService;
import com.example.AyrotekQuiz.model.User;
import com.example.AyrotekQuiz.repository.UserRepository;
import com.example.AyrotekQuiz.request.UserRequest;
import com.example.AyrotekQuiz.response.UserResponse;
import com.example.AyrotekQuiz.response.UserResponseConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserManager implements UserService {

    private final UserRepository userRepository;
    private final UserResponseConverter userResponseConverter;

    @Override
    public UserResponse addUser(UserRequest userRequest) {
        User user= userRepository.save(User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .age(userRequest.getAge())
                .email(userRequest.getEmail()).build());
        return userResponseConverter.from(user);
    }

    @Override
    public UserResponse updateUser(Long id, UserRequest userRequest) {
        User user= userRepository.findById(id).orElseThrow(null); //getbyid deprecated
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setAge(userRequest.getAge());
        user.setEmail(userRequest.getEmail());
        User updatedUser=userRepository.save(user);
        return userResponseConverter.from(updatedUser);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<UserResponse> getAllUser() {
        return userRepository.findAll().stream().map(userResponseConverter::from).collect(Collectors.toList());
    }

}