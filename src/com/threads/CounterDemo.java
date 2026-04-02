package com.threads;

public class CounterDemo {
	
	public static void main(String[] args) throws InterruptedException {
		Counter counter=new Counter();
		
		//create a runnable object
		//Thread1 myRunnable=new Thread1();
		//Thread t1=new Thread(myRunnable);
		Thread t1=new Thread(()->{
			for(int i=0;i<1000;i++) {
				counter.increment();
				}
		});
		
		Thread t2=new Thread(()->{
			for(int i=0;i<1000;i++) {
				counter.increment();
			}
		});
		
		  t1.start();
	      t2.start();

	      t1.join();
	      t2.join();

	        System.out.println(counter.getCount());
	}

}
