package ir.iust.trello_framework.service;

import ir.iust.trello_framework.model.Board;
import ir.iust.trello_framework.repository.ICRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

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
    public Iterator<Board> getAll() {
        return boardRepository.getAll();
    }

    @Override
    public Board getById(int id) {
        return (Board) boardRepository.getById(id);
    }

    @Override
    public void delete(int id) {
        boardRepository.delete(id);
    }
}
