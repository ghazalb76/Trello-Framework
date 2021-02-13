package ir.iust.trello_framework.repository;

import ir.iust.trello_framework.model.CheckList;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component(value = "checkListRepository")
public class CheckListRepository implements ICRUDRepository<CheckList>{
    private List<CheckList> checkListList = new ArrayList<>();

    @Override
    public void add(CheckList item) {
        checkListList.add(item);
    }

    @Override
    public Iterable<CheckList> findAll() {
        return checkListList;
    }

    @Override
    public void delete(CheckList item) {
        checkListList.remove(item);

    }

    @Override
    public CheckList findById(int id){
        for (CheckList checkList: checkListList){
            if(checkList.getId() == id){
                return checkList;
            }
        }
        return null;
    }

    @Override
    public void update(CheckList item) {

    }
}
