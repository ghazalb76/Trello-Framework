package ir.iust.trello_framework.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private String familyName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
