package ru.arc.Thread;

public class Test4 extends Thread{
    Test4() {
    };
    Test4 (Runnable r) {
         super(r);
    }
    public void run(){
        System.out.println("Inside Thread ");
    }
}

class RunnableDemo implements Runnable {

    public void run() {
        System.out.println(" Inside runnable");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        new Test4().start();
        new Test4(new RunnableDemo()).start();
    }
}
