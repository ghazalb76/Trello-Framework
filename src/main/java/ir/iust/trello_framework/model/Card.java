package ir.iust.trello_framework.model;

import java.time.LocalDateTime;
import java.util.List;

public class Card extends BaseEntity{

    private String title; // card title
    //ToDo Discuss probable new class (Images also included)
    private String description;  //card description
    //ToDo in create getter, always consider sending iterator or the main list
// array of checklist id foreign key
    private LocalDateTime creationDate; // card create time
    private LocalDateTime dueDate; // card due date
    private CardList cardList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public CardList getCardList() {
        return cardList;
    }

    public void setCardList(CardList cardList) {
        this.cardList = cardList;
    }
}

