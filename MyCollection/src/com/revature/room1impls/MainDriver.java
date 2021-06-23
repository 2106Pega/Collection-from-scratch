package com.revature.room1impls;

import java.util.Iterator;

public class MainDriver {

	public static void main(String[] args) {
		System.out.println("Works");
	
		
		
		
		QueueExpanded <String> Q = new QueueExpanded<String>();	
		Q.add("Hello");
		Q.add("Interfaces");
		Q.add("and");
		Q.add("Java");
		
		Iterator<String> intr = Q.iterator();
		
		while(intr.hasNext()) {
			System.out.println(intr.next());
			System.out.println("Nice");
		}
//		while(Q.hasNext()) {
//			System.out.println(Q.hasNext());
//			System.out.println("Nice");
//		}
		
		
	}

}
