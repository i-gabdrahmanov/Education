package ru.arc.Thread;


import java.util.concurrent.Callable;

public class TestThread implements Runnable, Callable<String> {
    public void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) throws Exception {
        TestThread callableThread = new TestThread();
        Thread thread = new Thread(new TestThread());
      //  Thread thread = new TestThread(new Thread));
        thread.start();
        thread.notify();
        int activeThreadCount = Thread.activeCount();
        System.out.println("Количество запущенных потоков: " + activeThreadCount);
       // System.out.println(thread.isAlive());
        System.out.println(callableThread.call());
        Callable<String> callable = () -> {
            return String.valueOf(Thread.activeCount());
        };
        System.out.println(callable.call());
    }

    @Override
    public String call() {
        return "Callable";
    }
}
