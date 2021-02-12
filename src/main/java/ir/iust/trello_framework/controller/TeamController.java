package ir.iust.trello_framework.controller;

import ir.iust.trello_framework.model.Team;
import ir.iust.trello_framework.model.User;
import ir.iust.trello_framework.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

@RestController
public class TeamController {
    @Autowired
    @Qualifier("teamService")
    IService teamService;

    @PostMapping("/addTeam")
    public void addTeam(@RequestBody Team team){
        teamService.add(team);
    }

    @GetMapping("/getAllTeams")
    public Iterator<Team> getAllTeams(){ return teamService.getAll(); }

    @PostMapping("/deleteTeam")
    public void deleteTeam(@RequestBody int id){
        teamService.delete(id);
    }

    @PostMapping("/getTeamById")
    public Team getTeamById(@RequestBody int id){ return (Team) teamService.getById(id); }
}
