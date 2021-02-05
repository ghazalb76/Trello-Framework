package ir.iust.trello_framework.model;

import java.time.LocalDateTime;

public class List {

    private int lid; // list id
    private String ltitle; // list title
    private int[] cids; // array of card id foreign keys
    private int tid; // team id foreign key
    private LocalDateTime lcreate; // list create time

    public int getLId() {
        return lid;
    }

    public void setLId(int id) {
        this.lid = id;
    }

    public String getLTitle() {
        return ltitle;
    }

    public void setLTitle(String title) {
        this.ltitle = title;
    }

    public int[] getCIds() {
        return cids;
    }

    public void setCId(int[] ids) {
        this.cids = ids;
    }



    public int geTId() {
        return tid;
    }

    public void seTId(int id) {
        this.tid = id;
    }

    public LocalDateTime getLCreate() {
        return lcreate;
    }

    public void setLCreate(LocalDateTime create) {
        this.lcreate = create;
    }




}
