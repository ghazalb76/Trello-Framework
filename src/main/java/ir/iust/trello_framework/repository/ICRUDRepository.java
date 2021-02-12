package ir.iust.trello_framework.repository;

import java.util.Iterator;

public interface ICRUDRepository<Model> {
    void add(Model item);

    Iterator<Model> getAll();

    void delete(Model item);

    Model getById(int id);

//    Iterator<Model> getAll(Model item);
//
//    Model find(Model item);
//
//    void update(Model item);
}
