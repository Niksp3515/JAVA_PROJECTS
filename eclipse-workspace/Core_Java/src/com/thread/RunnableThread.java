package com.thread;


public class RunnableThread implements Runnable {
public static void main(String[] args) {
	RunnableThread r1 = new RunnableThread();
	Thread t =new Thread(r1);
	t.start();
}

public void run() {
	System.out.println("Hello");
	
}
}
