package ir.iust.trello_framework.service;

import ir.iust.trello_framework.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> getAll();
}
