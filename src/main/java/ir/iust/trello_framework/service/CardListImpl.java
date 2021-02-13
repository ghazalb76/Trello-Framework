package ir.iust.trello_framework.service;

import ir.iust.trello_framework.model.CardList;
import ir.iust.trello_framework.repository.ICRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Iterator;

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
    public Iterable<CardList> findAll() {
        return userRepository.findAll();
    }

    @Override
    public CardList findById(int id) {
        return (CardList) userRepository.findById(id);
    }

    @Override
    public void update(CardList item) {

    }

    @Override
    public void delete(CardList cardList) {
        userRepository.delete(cardList);
    }
}
