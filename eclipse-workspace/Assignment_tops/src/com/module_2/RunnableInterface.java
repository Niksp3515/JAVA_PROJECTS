package com.module_2;

class MyRunnable implements Runnable {
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


public class RunnableInterface  {
	 public static void main(String[] args) {
	        
	        MyRunnable myRunnable = new MyRunnable();
	 
	        Thread thread = new Thread(myRunnable);

	        thread.start();
	 }
}
