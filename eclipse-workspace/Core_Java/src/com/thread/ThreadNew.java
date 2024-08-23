package com.thread;

class Thread1 extends Thread{
	String name;
	public Thread1(String name) {
	this.name = name;
	start();
	}
	
	public void run() {
		for (int i = 0; i <= 4; i++) {
			System.out.println("Thread for "+(i+1)+" times executing from "+name);
			try {
				if (name == "Nikhil") {
					Thread.sleep(1000);	
				}
				if (name == "Pranj") {
					Thread.sleep(500);	
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class ThreadNew{
public static void main(String[] args) {
	Thread1 t1 =new Thread1("Nikhil");
	Thread1 t2 = new Thread1("Pranj");
}
}
