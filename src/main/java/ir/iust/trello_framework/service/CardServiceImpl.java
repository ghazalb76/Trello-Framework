package ir.iust.trello_framework.service;

import ir.iust.trello_framework.model.Card;
import ir.iust.trello_framework.repository.ICRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service("cardService")
public class CardServiceImpl implements IService<Card> {
    @Autowired
    @Qualifier("cardRepository")
    ICRUDRepository cardRepository;

    @Override
    public void add(Card card) {
        cardRepository.add(card);
    }

    @Override
    public Iterator<Card> getAll() {
        return cardRepository.getAll();
    }

    @Override
    public Card getById(int id) {
        return (Card) cardRepository.getById(id);
    }

    @Override
    public void delete(int id) {
        cardRepository.delete(id);
    }
}
