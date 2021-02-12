package ir.iust.trello_framework.model;

import java.time.LocalDateTime;
import java.util.List;

public class CardList implements Matchable<CardList> {

    private int id; // list id
    private String title; // list title
    private Team team; // team id foreign key
    private LocalDateTime creationDate; // list create time
    private Board board;

    public CardList(int id, String title, Team team, LocalDateTime creationDate, Board board) {
	this.id = id;
	this.title = title;
	this.team = team;
	this.creationDate = creationDate;
	this.board = board;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    @Override
    public boolean match(CardList matcher) {
        return false;
    }

    @Override
    public boolean checkSame(CardList matcher) {
        return this.id == matcher.getId();
    }
}
