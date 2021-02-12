package ir.iust.trello_framework.model;

import java.lang.reflect.Field;
import java.time.LocalDateTime;

public class Board implements Matchable<Board> {

    private int id;
    private String name; // Board name
    private Team team; // team id foreign key
    private LocalDateTime creationDate; // Board create time

    public Board(int id, String name, Team team, LocalDateTime creationDate) {
	this.id = id;
	this.name = name;
	this.team = team;
	this.creationDate = creationDate;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean match(Board matcher) {
        return false;
    }

    @Override
    public boolean checkSame(Board matcher) {
        return this.id == matcher.getId();
    }
}
