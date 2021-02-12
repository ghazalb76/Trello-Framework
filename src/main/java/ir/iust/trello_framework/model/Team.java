package ir.iust.trello_framework.model;


import java.util.HashMap;
import java.util.List;

public class Team extends BaseEntity{

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
