package ir.iust.trello_framework.repository;

import ir.iust.trello_framework.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {
    private List<User> usersList = new ArrayList<>();

    public void add(User user){
         usersList.add(user);
    }

    public List<User> getAll(){
        return usersList;
    }
}
