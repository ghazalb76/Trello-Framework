package ir.iust.trello_framework.service;

import ir.iust.trello_framework.model.Board;
import ir.iust.trello_framework.repository.ICRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service(value = "boardService")
public class BoardServiceImpl implements IService<Board> {
    @Autowired
    @Qualifier("boardReository")
    ICRUDRepository boardRepository;

    @Override
    public void add(Board board) {
        boardRepository.add(board);
    }

    @Override
    public Iterable<Board> findAll() {
        return boardRepository.findAll();
    }

    @Override
    public Board findById(int id) {
        return (Board) boardRepository.findById(id);
    }

    @Override
    public void update(Board item) {

    }

    @Override
    public void delete(Board board) {
        boardRepository.delete(board);
    }
}
