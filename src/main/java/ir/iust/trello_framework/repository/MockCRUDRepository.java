package ir.iust.trello_framework.repository;

import ir.iust.trello_framework.model.Card;
import ir.iust.trello_framework.model.Matchable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MockCRUDRepository<Model extends Matchable> implements ICRUDRepository<Model> {
    List<Model> models;
    public MockCRUDRepository()
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
        List<Model> results = new ArrayList<>();
        for (Model m: models
             ) {
            if (m.match(item)) results.add(m);
        }
        return results.listIterator();
    }

    @Override
    public Model find(Model item) {


        for (Model m: models
        ) {
            if (m.match(item)) return m;
        }
        return null;
    }

    @Override
    public void update(Model item) {
        List<Model> results = new ArrayList<>();
        for (int ind=0; ind < models.size(); ind++) {
            Model m = models.get(ind);
            if (item.checkSame(m)) models.set(ind, item);

        }
    }

    @Override
    public void delete(Model item) {

        models.removeIf(m -> m.checkSame(item));
    }
}
