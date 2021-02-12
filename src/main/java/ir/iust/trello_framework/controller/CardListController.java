package ir.iust.trello_framework.controller;

import ir.iust.trello_framework.model.CardList;
import ir.iust.trello_framework.model.User;
import ir.iust.trello_framework.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

@RestController
public class CardListController {
    @Autowired
    @Qualifier("cardListService")
    IService cardListService;

    @PostMapping("/addCardList")
    public void addCardList(@RequestBody CardList cardList){
        cardListService.add(cardList);
    }

    @GetMapping("/getAllCardLists")
    public Iterator<CardList> getAllCardLists(){ return cardListService.getAll(); }

    @PostMapping("/deleteCardList")
    public void deleteCardList(@RequestBody int id){
        cardListService.delete(id);
    }

    @PostMapping("/getCardListById")
    public CardList getCardListById(@RequestBody int id){ return (CardList) cardListService.getById(id); }
}
