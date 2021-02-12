package ir.iust.trello_framework.model;

import java.time.LocalDateTime;

public class Board extends BaseEntity{

    private String name; // Board name
    private Team team; // team id foreign key
    private LocalDateTime creationDate; // Board create time

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
}
