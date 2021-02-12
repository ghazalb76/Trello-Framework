package ir.iust.trello_framework.model;

import java.util.HashMap;
import java.util.List;

public class Team extends BaseEntity implements Matchable<Team>{

    private int id; // team id
    private String name;
    private HashMap<String, Object> properties = new HashMap<>();

    public Team(int id, String name, HashMap<String, Object> properties) {
	this.id = id;
	this.name = name;
	for(String k : properties.keySet()) {
	    this.setProperty(k, properties.get(k));
	}
    } 
    
    public Object getProperty(String key)
    {
        return properties.get(key);
    }

    public void setProperty(String key, Object value)
    {
        properties.put(key, value);
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

    @Override
    public boolean match(Team matcher) {
        if (matcher.getId() != 0){
            if(this.id != matcher.getId())
                return false;}

        if (matcher.getName() != null) {
            if (this.name.equals(matcher.getName()))
                return false;
        }
        return true;
    }

    @Override
    public boolean checkSame(Team matcher) {
        return this.id == matcher.getId();
    }
}
