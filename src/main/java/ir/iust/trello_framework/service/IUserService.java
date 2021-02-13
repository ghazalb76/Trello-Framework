package ir.iust.trello_framework.service;

import ir.iust.trello_framework.model.Team;
import ir.iust.trello_framework.model.User;

public interface IUserService extends IService<User> {
    void addTeam(int id, Team team);
}
