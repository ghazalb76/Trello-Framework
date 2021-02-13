package ir.iust.trello_framework.controller;

import ir.iust.trello_framework.model.Card;
import ir.iust.trello_framework.model.CheckList;
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
    public void addCheckList(@RequestBody CheckList checkList){
        checkListService.add(checkList);
    }

    @GetMapping("/findAllCheckLists")
    public Iterable<CheckList> findAllCheckLists(){ return checkListService.findAll(); }

    @PostMapping("/deleteCheckList")
    public void deleteCheckList(@RequestBody CheckList checkList){
        checkListService.delete(checkList);
    }

    @PostMapping("/getCheckListById")
    public CheckList getCheckListById(@RequestBody int id){ return (CheckList) checkListService.findById(id); }

    @PostMapping("/updateCheckList")
    public void updateCheckList(@RequestBody CheckList checkList){ checkListService.update(checkList); }
}
