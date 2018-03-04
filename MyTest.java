package com.mycompany.stiw3054;

public class MyTest extends Thread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThreads t1 = new MyThreads();
        t1.start();
        MyThreadThread t2 = new MyThreadThread();
        t2.start();
    }
}