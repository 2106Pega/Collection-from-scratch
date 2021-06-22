package com.revature.datastructures;

import com.revature.datastructures.*;

public class MainDriver {

	public static void main(String[] args) {
		
	String Apple = "Apple";
	Integer x = 1;
	Integer y = 4;
	Integer z = 144;
	Integer asdasd = 13;
	
	QueueImpl<Integer> MyQueue = new QueueImpl<Integer>();
	
	//MyQueue.add(Apple);
	
	//System.out.println(MyQueue.peek());
	MyQueue.add(x);
	MyQueue.add(y);
	MyQueue.add(z);
	MyQueue.add(asdasd);
	
	System.out.println(MyQueue.pop());
	System.out.println(MyQueue.pop());
	System.out.println(MyQueue.pop());
	System.out.println(MyQueue.peek());
	System.out.println(MyQueue.remove());
	
	}
}
