package ir.iust.trello_framework.service;

import ir.iust.trello_framework.model.User;
import ir.iust.trello_framework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
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
}
