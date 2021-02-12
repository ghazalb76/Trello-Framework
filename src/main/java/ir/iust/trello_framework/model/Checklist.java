package ir.iust.trello_framework.model;

import ir.iust.trello_framework.model.enumeration.CheckListStatusEnum;

public class Checklist extends BaseEntity implements Matchable<Checklist>{

    private String content; // checklist title
    private CheckListStatusEnum status;
    private Card card;

    public Checklist(int id, String content, CheckListStatusEnum status, Card card) {
	this.id = id;
	this.content = content;
	this.status = status;
	this.card = card;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CheckListStatusEnum getStatus() {
        return status;
    }

    public void setStatus(CheckListStatusEnum status) {
        this.status = status;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public boolean match(Checklist matcher) {
        return false;
    }

    @Override
    public boolean checkSame(Checklist matcher) {
        return this.id == matcher.getId();
    }
}
