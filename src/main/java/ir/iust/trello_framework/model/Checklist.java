package ir.iust.trello_framework.model;

enum CheckListStatus
{
    checked,
    unchecked
}

public class Checklist {

    private int id; //checklist id
    private String content; // checklist title
    private CheckListStatus status;
    private Card card;


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

    public CheckListStatus getStatus() {
        return status;
    }

    public void setStatus(CheckListStatus status) {
        this.status = status;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
