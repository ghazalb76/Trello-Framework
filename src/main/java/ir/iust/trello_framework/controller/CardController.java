package ir.iust.trello_framework.controller;

import ir.iust.trello_framework.model.Card;
import ir.iust.trello_framework.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

@RestController
public class CardController {
    @Autowired
    @Qualifier("cardService")
    IService cardService;

    @PostMapping("/addCard")
    public void addCard(@RequestBody Card card){
        cardService.add(card);
    }

    @GetMapping("/getAllCards")
    public Iterable<Card> getAllCards(){ return cardService.findAll(); }

    @PostMapping("/deleteCard")
    public void deleteCard(@RequestBody int id){
        cardService.delete(id);
    }

    @PostMapping("/getCardById")
    public Card getCardById(@RequestBody int id){ return (Card) cardService.findById(id); }
}
