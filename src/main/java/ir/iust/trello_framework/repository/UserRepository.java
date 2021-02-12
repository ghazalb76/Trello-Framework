package ir.iust.trello_framework.repository;

import ir.iust.trello_framework.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component(value = "userRepository")
public class UserRepository implements ICRUDRepository<User>{
    private List<User> usersList = new ArrayList<>();

    @Override
    public void add(User item) {
        usersList.add(item);
    }

    @Override
    public Iterator<User> getAll() {
        return (Iterator<User>) usersList;
    }

    @Override
    public void delete(User item) {
        usersList.remove(item);

    }

    @Override
    public User getById(int id){
        for (User user: usersList){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }
}
