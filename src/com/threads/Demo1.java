package com.threads;

public class Demo1 extends MyThread {

	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getName());
		//create myThread Object
        MyThread t=new MyThread();
        t.start(); 
        
        for(int i=1;i<=10;i++) {
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        	System.out.println("Main Thread: "+i);
        }
	}

}
