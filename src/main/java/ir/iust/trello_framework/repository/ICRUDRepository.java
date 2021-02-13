package ir.iust.trello_framework.repository;

import java.util.Iterator;

public interface ICRUDRepository<Model> {
    void add(Model item);

    Iterable<Model> findAll();

    void delete(Model item);

    Model findById(int id);

    void update(Model item);

}
