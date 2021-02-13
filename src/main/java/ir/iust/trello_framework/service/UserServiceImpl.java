package ir.iust.trello_framework.service;

import ir.iust.trello_framework.model.Team;
import ir.iust.trello_framework.model.User;
import ir.iust.trello_framework.repository.TeamRepository;
import ir.iust.trello_framework.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    UserRepositoryImpl userRepository;

    @Autowired
    TeamRepository teamRepository;

    @Override
    public void addTeam(int id, Team team) {
        userRepository.findById(id).addTeam(team);
        if(teamRepository.findById(team.getId()) == null)
            teamRepository.add(team);
    }

    @Override
    public void add(User item) {
        userRepository.add(item);
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void delete(User item) {
        userRepository.delete(item);
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void update(User item) {
        userRepository.update(item);
    }
}
