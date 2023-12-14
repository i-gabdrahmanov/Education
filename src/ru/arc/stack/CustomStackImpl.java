package ru.arc.stack;

import java.util.ArrayList;

public class CustomStackImpl<T> implements CustomStack<T> {

    private ArrayList<T> list = new ArrayList<>();


    @Override
    public void push(T item) {
        list.add(0, item);
    }

    @Override
    public T pop() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }
}
