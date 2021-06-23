package com.revature.room1impls;

import java.util.Iterator;

public class MainDriver {

	public static void main(String[] args) {

		QueueExpanded <String> Q = new QueueExpanded<String>();	
		Q.add("Hello");
		Q.add("Interfaces");
		Q.add("and");
		Q.add("Java");
		
		Iterator<String> intr = Q.iterator();
		
		while(intr.hasNext()) {
			System.out.println(intr.next());
		}
		while(intr.hasNext()) {
			System.out.println(intr.next());
		}
	}
}
