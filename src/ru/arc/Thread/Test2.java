package ru.arc.Thread;

public class Test2 implements Runnable{
    String x, y;

    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                // Race condition
                x = "Hello";
                y = "Java";
                System.out.println(x + " " + y + " " + " ");
            }
        }
    }

    public static void main(String args[]) {
        Test2 run = new Test2();
            Thread obj1 = new Thread(run);
            Thread obj2 = new Thread(run);
            obj1.start();
            obj2.start();
    }
}
