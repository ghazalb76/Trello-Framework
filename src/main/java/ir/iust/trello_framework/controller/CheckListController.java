package ir.iust.trello_framework.controller;

import ir.iust.trello_framework.model.Checklist;
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
public class CheckListController {
    @Autowired
    @Qualifier("checkListService")
    IService checkListService;

    @PostMapping("/addCheckList")
    public void addCheckList(@RequestBody Checklist checkList){
        checkListService.add(checkList);
    }

    @GetMapping("/getAllCheckLists")
    public Iterator<Checklist> getAllCheckLists(){ return checkListService.getAll(); }

    @PostMapping("/deleteCheckList")
    public void deleteCheckList(@RequestBody int id){
        checkListService.delete(id);
    }

    @PostMapping("/getCheckListById")
    public Checklist getCheckListById(@RequestBody int id){ return (Checklist) checkListService.getById(id); }
}
