package ir.iust.trello_framework.controller;

import ir.iust.trello_framework.model.User;
import ir.iust.trello_framework.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    @Qualifier("userService")
    IService userService;

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userService.add(user);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){ return userService.getAll(); }

    @PostMapping("/deleteUser")
    public void deleteUser(@RequestBody int id){
        userService.delete(id);
    }

    @PostMapping("/getUserByID")
    public User getUserById(@RequestBody int id){ return (User) userService.getById(id); }
}
