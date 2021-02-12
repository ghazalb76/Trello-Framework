package ir.iust.trello_framework.model;

import ir.iust.trello_framework.model.enumeration.CheckListStatusEnum;

public class Checklist extends BaseEntity{

    private String content; // checklist title
    private CheckListStatusEnum status;
    private Card card;

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
}
