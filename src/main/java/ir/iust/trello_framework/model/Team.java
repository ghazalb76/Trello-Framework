package ir.iust.trello_framework.model;


import java.util.HashMap;
import java.util.List;

public class Team {

    private int id; // team id
    private String name;
    private HashMap<String, Object> properties = new HashMap<>();

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


}
