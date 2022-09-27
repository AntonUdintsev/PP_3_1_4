package com.example.pp_3_1_2.restController;


import com.example.pp_3_1_2.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class RestUserController {


    @GetMapping("/user")
    public ResponseEntity<User> getUserByUsername (@AuthenticationPrincipal User user) {
        return new ResponseEntity<>(user,HttpStatus.OK);
    }
}