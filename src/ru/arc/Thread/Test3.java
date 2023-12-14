package ru.arc.Thread;

public class Test3 implements Runnable{
    int x = 0;
    int y =0;

    public static void main(String[] args) {
        Test3 obj = new Test3();
        new Thread(obj).start();
        new Thread(obj).start();
    }
    public synchronized void run(){
        for (int i = 0; i < 100; i++) {
            x++;
            y++;
            System.out.println(x + " " + y);
        }
    }
}
