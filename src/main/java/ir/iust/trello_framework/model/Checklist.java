package ir.iust.trello_framework.model;


public class Checklist {

    private int clid; //checklist id
    private String cltitle; // checklist title

    public int getClId() {
        return clid;
    }

    public void setClId(int id) {
        this.clid = id;
    }

    public String getClTitle() {
        return cltitle;
    }

    public void setClTitle(String title) {
        this.cltitle = title;
    }


}
