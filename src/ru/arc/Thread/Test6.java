package ru.arc.Thread;

public class Test6 extends Thread {
    public static void main(String[] args) {
        Test6 test6 = new Test6();
        test6.run();
    }

    public void run() {
       for (int i = 1; i<3; i++){
           System.out.println(i + "..");
       }
    }

}
