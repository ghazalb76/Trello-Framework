package ir.iust.trello_framework.model;

public interface Matchable<T> {

    boolean match(T matcher);

    boolean checkSame(T matcher);
}
