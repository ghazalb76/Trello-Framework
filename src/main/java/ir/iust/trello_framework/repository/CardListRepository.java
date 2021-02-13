package ir.iust.trello_framework.repository;

import ir.iust.trello_framework.model.CardList;
import ir.iust.trello_framework.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component(value = "cardListRepository")
public class CardListRepository implements ICRUDRepository<CardList> {
    private List<CardList> cardListList = new ArrayList<>();

    @Override
    public void add(CardList item) {
        cardListList.add(item);
    }

    @Override
    public Iterable<CardList> findAll() {
        return cardListList;
    }

    @Override
    public void delete(CardList item) {
        cardListList.remove(item);

    }

    @Override
    public CardList findById(int id){
        for (CardList cardList: cardListList){
            if(cardList.getId() == id){
                return cardList;
            }
        }
        return null;
    }

    @Override
    public void update(CardList item) {

    }
}
