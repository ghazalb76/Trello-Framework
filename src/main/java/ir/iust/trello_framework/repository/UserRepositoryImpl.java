package ir.iust.trello_framework.repository;

import ir.iust.trello_framework.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component(value = "userRepository")
public class UserRepositoryImpl implements ICRUDRepository<User>{
    private List<User> usersList = new ArrayList<>();

    @Override
    public void add(User item) {
        usersList.add(item);
    }

    @Override
    public Iterable<User> findAll() {
        return usersList;
    }

    @Override
    public void delete(User item) {
        usersList.remove(item);

    }

    @Override
    public User findById(int id){
        for (User user: usersList){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    @Override
    public void update(User item) {
        for (User user: usersList){
            if(user.getId() == item.getId()){
                user.setName(item.getName());
                user.setEmail(item.getEmail());
                user.setPassword(item.getPassword());
                user.setUsername(item.getUsername());
            }
        }

    }
}
