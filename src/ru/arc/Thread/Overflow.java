package ru.arc.Thread;

import java.util.ArrayList;
import java.util.List;

public class Overflow {


    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getId());
        };
        for (int i = 0; i< 1000000; i++) {
            threads.add(new Thread(task));
        }
        for (Thread t : threads) {
            t.start();
            t.wait(100);
        }
    }

}
