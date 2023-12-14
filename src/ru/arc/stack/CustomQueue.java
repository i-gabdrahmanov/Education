package ru.arc.stack;

public interface CustomQueue <T>{
    void add(T item); // Добавление в концец
    T remove(); // Удаление из начала FIFO
    boolean isEmpty();
}
