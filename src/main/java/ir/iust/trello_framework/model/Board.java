package ir.iust.trello_framework.model;

import java.time.LocalDateTime;

public class Board {

    private int bid; // Board id
    private String bname; // Board name
    private int[] lids; // array of list id foreign keys
    private int tid; // team id foreign key
    private LocalDateTime bcreate; // Board create time

    public int getBid() {
        return bid;
    }

    public void setBid(int id) {
        this.bid = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String name) {
        this.bname = name;
    }

    public int[] getLids() {
        return lids;
    }

    public void setLid(int[] ids) {
        this.lids = ids;
    }

    public int geTTid() {
        return tid;
    }

    public void seTTid(int id) {
        this.tid = id;
    }

    public LocalDateTime getBCreate() {
        return bcreate;
    }

    public void setBCreate(LocalDateTime create) {
        this.bcreate = create;
    }




}
