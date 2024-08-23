package com.module_2;

class TestMultiPriority1 extends Thread {
    public void run() {
        
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("1");
        TestMultiPriority1 m1 = new TestMultiPriority1();
        TestMultiPriority1 m2 = new TestMultiPriority1();
        System.out.println("2");
       
        //m1.setName("mythread-1");
        //m2.setName("mythread-2");

        
        m1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("3");
        m2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("4");
        
        m1.start();
        System.out.println("5");
        m2.start();
        System.out.println("6");
        
    }
}

