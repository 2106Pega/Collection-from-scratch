package com.revature.datastructures;

public class MainDriver {
	
	public static void main(String[] args) {
		Queue<String> queue = new QueueImpl<String>();
		queue.add("Dog");
		queue.add("Cat");
		queue.add("Fish");
		queue.add("Bird");
		queue.add("Bat");
		queue.print();
		System.out.println(queue.peek());
		queue.print();
	}
	
}
