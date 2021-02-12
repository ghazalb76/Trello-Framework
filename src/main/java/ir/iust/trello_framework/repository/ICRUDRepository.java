package ir.iust.trello_framework.repository;

import ir.iust.trello_framework.model.Card;

import java.util.Iterator;

public interface ICRUDRepository<Model> {
    public void add(Model item);

    public Iterator<Model> getAll();

    public Iterator<Model> getAll(Model item);

    public Model find(Model item);

    public void update(Model item);

    public void delete(Model item);
}
