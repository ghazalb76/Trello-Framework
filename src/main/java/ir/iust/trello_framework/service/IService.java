package ir.iust.trello_framework.service;

import ir.iust.trello_framework.model.User;

import java.util.List;

public interface IService<T> {
    void add(T t);
    List<T> getAll();
    T getById(int id);
    void delete(int id);
}
