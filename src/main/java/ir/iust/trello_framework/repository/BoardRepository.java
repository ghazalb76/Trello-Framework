package ir.iust.trello_framework.repository;

import ir.iust.trello_framework.model.Board;
import ir.iust.trello_framework.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component(value = "boardReository")
public class BoardRepository implements ICRUDRepository<Board> {
    private List<Board> boardList = new ArrayList<>();

    @Override
    public void add(Board item) {
        boardList.add(item);
    }

    @Override
    public Iterable<Board> findAll() {
        return boardList;
    }

    @Override
    public void delete(Board item) {
        boardList.remove(item);

    }

    @Override
    public Board findById(int id){
        for (Board board: boardList){
            if(board.getId() == id){
                return board;
            }
        }
        return null;
    }

    @Override
    public void update(Board item) {

    }
}
