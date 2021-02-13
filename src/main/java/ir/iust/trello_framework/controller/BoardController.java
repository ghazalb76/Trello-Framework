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

    @GetMapping("/findAllBoards")
    public Iterable<Board> findAllBoards(){ return boardService.findAll(); }

    @PostMapping("/deleteBoard")
    public void deleteBoard(@RequestBody Board board){
        boardService.delete(board);
    }

    @PostMapping("/getBoardById")
    public Board getBoardById(@RequestBody int id){ return (Board) boardService.findById(id); }

    @PostMapping("/updateBoard")
    public void updateBoard(@RequestBody Board board){ boardService.update(board); }
}
