package com.example.Ws_lektion_8_security_https.controller;

import com.example.Ws_lektion_8_security_https.model.User;
import com.example.Ws_lektion_8_security_https.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers () {

        return ResponseEntity.ok(userRepository.findAll());

    }

    @PostMapping
    public ResponseEntity<User> postUser (@RequestBody User user) {

        return ResponseEntity.ok(user);
    }

}
