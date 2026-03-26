package com.threads;

public class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
		    try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("My Thread: "+ i);
			
		}
	}


}
