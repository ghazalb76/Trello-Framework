package ir.iust.trello_framework.service;

import ir.iust.trello_framework.model.User;
import ir.iust.trello_framework.repository.ICRUDRepository;
import ir.iust.trello_framework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements IService<User> {
    @Autowired
    @Qualifier("userRepository")
    ICRUDRepository userRepository;

    @Override
    public void add(User user) {
        userRepository.add(user);
    }

    @Override
    public Iterator<User> getAll() {
        return userRepository.getAll();
    }

    @Override
    public User getById(int id) {
        return (User) userRepository.getById(id);
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);
    }
}
