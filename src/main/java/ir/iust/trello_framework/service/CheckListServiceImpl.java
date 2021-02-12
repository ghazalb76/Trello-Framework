package ir.iust.trello_framework.service;

import ir.iust.trello_framework.model.Checklist;
import ir.iust.trello_framework.repository.ICRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service(value = "checkListService")
public class CheckListServiceImpl implements IService<Checklist> {
    @Autowired
    @Qualifier("checkListRepository")
    ICRUDRepository checkListRepository;

    @Override
    public void add(Checklist checklist) {
        checkListRepository.add(checklist);
    }

    @Override
    public Iterator<Checklist> getAll() {
        return checkListRepository.getAll();
    }

    @Override
    public Checklist getById(int id) {
        return (Checklist) checkListRepository.getById(id);
    }

    @Override
    public void delete(int id) {
        checkListRepository.delete(id);
    }
}
