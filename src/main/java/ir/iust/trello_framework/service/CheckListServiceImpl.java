package ir.iust.trello_framework.service;

import ir.iust.trello_framework.model.CheckList;
import ir.iust.trello_framework.repository.ICRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service(value = "checkListService")
public class CheckListServiceImpl implements IService<CheckList> {
    @Autowired
    @Qualifier("checkListRepository")
    ICRUDRepository checkListRepository;

    @Override
    public void add(CheckList checklist) {
        checkListRepository.add(checklist);
    }

    @Override
    public Iterable<CheckList> findAll() {
        return checkListRepository.findAll();
    }

    @Override
    public CheckList findById(int id) {
        return (CheckList) checkListRepository.findById(id);
    }

    @Override
    public void update(CheckList item) {

    }

    @Override
    public void delete(CheckList checkList) {
        checkListRepository.delete(checkList);
    }
}
