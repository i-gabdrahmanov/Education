package ru.arc.stack;

public interface CustomStack<T> {
    void push(T item); // Добавить в конец
    T pop();    // Взять из конца LIFO

    boolean isEmpty();
    int size();
}
