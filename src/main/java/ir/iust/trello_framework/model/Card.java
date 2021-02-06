package ir.iust.trello_framework.model;

import java.time.LocalDateTime;

public class Card {

    private int cid; // card id
    private String ctitle; // card title
    private String cdesc;  //card description
    private  int[] clids; // array of checklist id foreign key
    private LocalDateTime ccreate; // card create time
    private LocalDateTime cdue; // card due date

    public int getCId() {
        return cid;
    }

    public void setCId(int id) {
        this.cid = id;
    }

    public String getCTitle() {
        return ctitle;
    }

    public void setCTitle(String title) {
        this.ctitle = title;
    }

    public String getCDesc() {
        return cdesc;
    }

    public void setCDesc(String desc) {
        this.cdesc = desc;
    }

    public int[] getClIds() {
        return clids;
    }

    public void setClIds(int[] ids) {
        this.clids = ids;
    }

    public LocalDateTime getCCreate() {
        return ccreate;
    }

    public void setCCreate(LocalDateTime create) {
        this.ccreate = create;
    }

    public LocalDateTime getCDue() {
        return cdue;
    }

    public void setCDue(LocalDateTime due) {
        this.cdue = due;
    }



}

