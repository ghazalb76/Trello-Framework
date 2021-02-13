package ir.iust.trello_framework.controller;

import ir.iust.trello_framework.model.Team;
import ir.iust.trello_framework.model.User;
import ir.iust.trello_framework.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    IUserService userService;

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userService.add(user);
    }

    @GetMapping("/getAllUsers")
    public Iterable<User> getAllUsers(){ return userService.findAll(); }

    @PostMapping("/deleteUser")
    public void deleteUser(@RequestBody User user){
        userService.delete(user);
    }

    @PostMapping("/getUserByID")
    public User getUserById(@RequestBody int id){ return (User) userService.findById(id); }

    @PostMapping("/updateUser")
    public void updateUser(@RequestBody User user){ userService.update(user); }

    @PostMapping("/addTeamToUser")
    public void updateUser(@RequestBody int id, Team team){ userService.addTeam(id, team); }
}
