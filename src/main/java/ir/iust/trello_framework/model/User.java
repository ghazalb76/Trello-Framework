package ir.iust.trello_framework.model;


import java.util.List;
import java.util.ArrayList

public class User {

    private int id; // user id
    private String name;
    private String email;
    private String username;
    private String password;
    private List<Team> teamList = new ArrayList();

    public User(int id, String name, String email, String username, String password, List<Team> teamList) {
	this.id = id;
	this.name = name;
	this.email = email;
	this.username = username;
	this.password = password;

	for(Team t : teamList) {
	    this.teamList.add(t);
	}
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void addTeam(Team t) {
	teamList.add(t);
    }

    public void removeTeam(Team t) {
	teamList.remove(t);
    }
    
    public List<Team> getTeamList() {
	return teamList;
    } 
}
