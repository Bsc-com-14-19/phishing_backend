package com.example.phish.Controller;

import com.example.phish.entity.User;
import com.example.phish.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "owasp/")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "users")
    public List<User> getUsers(){

        return userService.getAllUsers();
    }
    @PostMapping(path = "register")
    public void saveDetails(@RequestBody User user){

        userService.save(user);
    }

}
