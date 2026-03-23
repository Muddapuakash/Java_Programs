package com.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();
        //add elements into queue - enqueue
		queue.add(100);
		queue.add(101);
		queue.add(300);
		
		System.out.println("Queue: "+queue);
		
		//peek()
		System.out.println("Front element of the queue: "+queue.peek());
		
		//remove
		System.out.println("removed element: "+queue.remove());
		
		System.out.println("elemenst after removal: "+queue);
		
		System.out.println("elements are presnt are not: "+queue.isEmpty());
	}

}
