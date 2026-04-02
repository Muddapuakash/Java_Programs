package com.threads;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("My thread");
    }
}