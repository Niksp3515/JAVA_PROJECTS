package com.module_2;

class MyThread1 extends Thread {
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class MyThread {
    public static void main(String[] args) {
       
        MyThread1 myThread = new MyThread1();
        myThread.start();
    }
}
