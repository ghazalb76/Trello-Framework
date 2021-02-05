package ir.iust.trello_framework.controller;

import ir.iust.trello_framework.model.User;
import ir.iust.trello_framework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userService.add(user);
    }

    @GetMapping("/getUsers")
    public List<User> getUsers(){ return userService.getAll(); }
}
