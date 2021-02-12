package ir.iust.trello_framework.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MockCRUDRepository<Model> implements ICRUDRepository<Model> {
    List<Model> models;

    MockCRUDRepository()
    {
        models = new ArrayList<Model>();
    }

    @Override
    public void add(Model item) {
        models.add(item);
    }

    @Override
    public Iterator<Model> getAll() {
        return models.listIterator();
    }

    @Override
    public Iterator<Model> findAll(Model item) {
        return null;
    }

    @Override
    public Model find(Model item) {
        return null;
    }

    @Override
    public void update(Model item) {

    }

    @Override
    public void delete(Model item) {

    }
}
