package com.revature.datastructures;

public class MainDriver {
	
	public static void main(String[] args) {
		Set<String> queue = new SetImpl<String>();
		queue.add("Bad");
		queue.add("Really bad");
		queue.add("Really really bad");
		queue.add("Bad");
		queue.add("Really really bad");
		queue.print();
		queue.remove("Bad");
		queue.print();
	}
	
}
