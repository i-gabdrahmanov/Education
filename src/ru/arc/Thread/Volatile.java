package ru.arc.Thread;

public class Volatile {
    public static void main(String[] args) {
        Vol vol = new Vol();
        Thread thread = new Thread(vol);
        thread.start();
        Thread thread2 = new Thread(vol);
        thread2.start();
    }
}
class Vol implements Runnable{
    private volatile int t;
    Vol () {
        this.t = 0;
    }

    @Override
    public void run() {
        for (int i=0; i< 1000; i++) {
            t++;
            System.out.println("T= " + t);
           // System.out.println("i= " + i);
        }
    }
}
