package ir.iust.trello_framework.service;

import ir.iust.trello_framework.model.Card;
import ir.iust.trello_framework.model.CardList;
import ir.iust.trello_framework.repository.ICRUDRepository;
import ir.iust.trello_framework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service(value = "cardListService")
public class CardListImpl implements IService<CardList> {
    @Autowired
    @Qualifier("cardListRepository")
    ICRUDRepository userRepository;

    @Override
    public void add(CardList cardList) {
        userRepository.add(cardList);
    }

    @Override
    public Iterator<CardList> getAll() {
        return userRepository.getAll();
    }

    @Override
    public CardList getById(int id) {
        return (CardList) userRepository.getById(id);
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);
    }
}
