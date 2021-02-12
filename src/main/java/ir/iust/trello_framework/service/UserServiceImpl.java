package ir.iust.trello_framework.service;

import ir.iust.trello_framework.model.User;
import ir.iust.trello_framework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements IService<User> {
    @Autowired
    UserRepository userRepository;

    @Override
    public void add(User user) {
        userRepository.add(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @Override
    public User getById(int id) {
        return userRepository.getById(id);
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);
    }
}
