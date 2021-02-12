package ir.iust.trello_framework.repository;

import ir.iust.trello_framework.model.Checklist;
import ir.iust.trello_framework.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component(value = "checkListRepository")
public class CheckListRepository implements ICRUDRepository<Checklist>{
    private List<Checklist> checkListList = new ArrayList<>();

    @Override
    public void add(Checklist item) {
        checkListList.add(item);
    }

    @Override
    public Iterator<Checklist> getAll() {
        return (Iterator<Checklist>) checkListList;
    }

    @Override
    public void delete(Checklist item) {
        checkListList.remove(item);

    }

    @Override
    public Checklist getById(int id){
        for (Checklist checkList: checkListList){
            if(checkList.getId() == id){
                return checkList;
            }
        }
        return null;
    }
}
