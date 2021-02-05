package ir.iust.trello_framework.model;



public class team {

    private int tid; // team id
    private String tname;
    private int[] uids; // array of team member user id foreign keys

    public int getTId() {
        return tid;
    }

    public void setTId(int id) {
        this.tid = id;
    }


    public String getTName() {
        return tname;
    }

    public void setTName(String name) {
        this.tname = name;
    }


    public int[] getUIds() {
        return uids;
    }

    public void setUIds(int[] ids) {
        this.uids = ids;
    }
}
