package ir.iust.trello_framework.service;

import ir.iust.trello_framework.model.Card;
import ir.iust.trello_framework.repository.ICRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service("cardService")
public class CardServiceImpl implements IService<Card> {
    @Autowired
    @Qualifier("cardRepository")
    ICRUDRepository cardRepository;

    @Override
    public void add(Card item) {

    }

    @Override
    public Iterable<Card> findAll() {
        return null;
    }

    @Override
    public void delete(Card item) {

    }

    @Override
    public Card findById(int id) {
        return null;
    }

    @Override
    public void update(Card item) {

    }
}
