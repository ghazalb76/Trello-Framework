package ir.iust.trello_framework.service;

import ir.iust.trello_framework.model.Team;
import ir.iust.trello_framework.repository.ICRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service(value = "teamService")
public class TeamServiceImpl implements IService<Team> {
    @Autowired
    @Qualifier("teamRepository")
    ICRUDRepository teamRepository;

    @Override
    public void add(Team team) {
        teamRepository.add(team);
    }

    @Override
    public Iterable<Team> findAll() {
        return teamRepository.findAll();
    }

    @Override
    public Team findById(int id) {
        return (Team) teamRepository.findById(id);
    }

    @Override
    public void update(Team item) {

    }

    @Override
    public void delete(Team team) {
        teamRepository.delete(team);
    }
}
