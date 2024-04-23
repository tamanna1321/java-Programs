package threadpackage;

import java.util.*;

public class MyThread {
    public static void main(String[] args) {
        Runnable r1 = new A("Thread A");
        Thread t1 = new Thread(r1);
        t1.start();
        try {
            t1.join(2000);
        } catch (Exception e) {
        }
        System.out.println("After 2 Seconds ");
        Runnable r2 = new A("Thread B");
        Thread t2 = new Thread(r2);
        t2.start();
        try {
            t2.join(5000);
        } catch (Exception e) {
        }
        System.out.println("After 5 seconds");
        t1.suspend();
        try {
            t2.join(10000);
        } catch (Exception e) {
        }
        t2.stop();
        System.out.println("Thread B stopped after 10 seconds");
        t1.stop();
        System.out.println("Thread A stopped after 10 seconds");
    }
}

class A implements Runnable {
    String name;

    A(String threadname) {
        name = threadname;
        System.out.println(name + " Created");

    }

    public void run() {
        try {
            for (int i = 1; i <= 25; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}