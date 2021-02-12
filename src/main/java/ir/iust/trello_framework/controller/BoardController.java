package ir.iust.trello_framework.controller;

import ir.iust.trello_framework.model.Board;
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
public class BoardController {
    @Autowired
    @Qualifier("boardService")
    IService boardService;

    @PostMapping("/addBoard")
    public void addBoard(@RequestBody Board board){
        boardService.add(board);
    }

    @GetMapping("/getAllBoards")
    public Iterator<Board> getAllBoards(){ return boardService.getAll(); }

    @PostMapping("/deleteBoard")
    public void deleteBoard(@RequestBody int id){
        boardService.delete(id);
    }

    @PostMapping("/getBoardById")
    public Board getBoardById(@RequestBody int id){ return (Board) boardService.getById(id); }
}
