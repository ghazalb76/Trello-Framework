package ir.iust.trello_framework.repository;

import ir.iust.trello_framework.model.Team;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component(value = "teamRepository")
public class TeamRepository implements ICRUDRepository<Team> {
    private List<Team> teamList = new ArrayList<>();

    @Override
    public void add(Team item) {
        teamList.add(item);
    }

    @Override
    public Iterator<Team> getAll() {
        return (Iterator<Team>) teamList;
    }

    @Override
    public void delete(Team item) {
        teamList.remove(item);

    }

    @Override
    public Team getById(int id){
        for (Team team: teamList){
            if(team.getId() == id){
                return team;
            }
        }
        return null;
    }
}
