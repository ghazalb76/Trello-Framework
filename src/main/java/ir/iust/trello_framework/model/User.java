package ir.iust.trello_framework.model;


import java.util.List;
import java.util.ArrayList;

public class User extends BaseEntity implements Matchable<User>{


    private String name;
    private String email;
    private String username;
    private String password;
    private List<Team> teamList = new ArrayList();

    public User(int id, String name, String email, String username, String password, List<Team> teamList) {
	this.name = name;
	this.email = email;
	this.username = username;
	this.password = password;

        this.teamList.addAll(teamList);
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

    @Override
    public boolean match(User matcher) {
        if (matcher.getId() != 0){
        if(this.getId() != matcher.getId())
            return false;}

        if (matcher.getName() != null) {
            if (!this.name.equals(matcher.getName()))
                return false;
        }
        if (matcher.getEmail() != null) {
            if (!this.email.equals(matcher.getEmail()))
                return false;
        }

        if (matcher.getUsername() != null) {
            if (!this.username.equals(matcher.getUsername()))
                return false;
        }
        return true;
    }

    @Override
    public boolean checkSame(User matcher) {
        return this.getId() == matcher.getId();
    }
}
