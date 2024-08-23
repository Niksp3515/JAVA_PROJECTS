package com.thread;

//class NewThread implements Runnable{
class NewThread extends Thread{


	Thread t;
	public NewThread() {
		super("Child Thread");
		start();
	}
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(this+ " "+ i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread Exiting.");
	}
	
}

public class ThreadDemo {
	 
	public static void main(String[] args) {
		new NewThread();
		Thread t = Thread.currentThread();
		t.setName("Nikhil");
		System.out.println(t);
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(t+ " "+ i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
