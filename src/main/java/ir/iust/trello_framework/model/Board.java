package ir.iust.trello_framework.model;

import java.time.LocalDateTime;

public class Board extends BaseEntity implements Matchable<Board>{


    private String name; // Board name
    private Team team; // team id foreign key
    private LocalDateTime creationDate; // Board create time

    public Board(int id, String name, Team team, LocalDateTime creationDate) {
	this.name = name;
	this.team = team;
	this.creationDate = creationDate;
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
        return this.getId() == matcher.getId();
    }
}
