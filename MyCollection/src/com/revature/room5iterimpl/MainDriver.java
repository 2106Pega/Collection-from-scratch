package com.revature.room5iterimpl;


import java.util.Iterator;
import com.revature.datastructures.Queue;
import com.revature.room1impls.QueueImpl;

public class MainDriver {

	public static void main(String[] args) {
		
		Queue<String> queue = new QueueImpl<String>();
		
		queue.add("a");
		queue.add("b");
		queue.add("c");
		queue.add("d");
		
		Iterator<String> queueIter = queue.iterator();
		
		
	}

}
