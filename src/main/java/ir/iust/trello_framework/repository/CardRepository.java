package ir.iust.trello_framework.repository;

import ir.iust.trello_framework.model.Card;
import ir.iust.trello_framework.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component(value = "cardRepository")
public class CardRepository implements ICRUDRepository<Card> {
    private List<Card> cardList = new ArrayList<>();

    @Override
    public void add(Card item) {
        cardList.add(item);
    }

    @Override
    public Iterator<Card> getAll() {
        return (Iterator<Card>) cardList;
    }

    @Override
    public void delete(Card item) {
        cardList.remove(item);

    }

    @Override
    public Card getById(int id){
        for (Card card: cardList){
            if(card.getId() == id){
                return card;
            }
        }
        return null;
    }
}
