package com.module_2;

class TestThreadTwice extends Thread {
	
	
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
    	System.out.println("1");
        TestThreadTwice t1 = new TestThreadTwice();
        
        t1.setPriority(MAX_PRIORITY);
        
        t1.start();
        //t1.start(); 
    }
}