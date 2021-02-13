package ir.iust.trello_framework.service;

import java.util.Iterator;

public interface IService<Model> {
    void add(Model item);

    Iterable<Model> findAll();

    void delete(Model item);

    Model findById(int id);

    void update(Model item);
}
