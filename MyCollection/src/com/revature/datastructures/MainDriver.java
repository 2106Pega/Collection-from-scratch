package com.revature.datastructures;

public class MainDriver {

	public static void main(String[] args) {
		
		Set<String> stringSet = new SetImpl<String>();
		
		System.out.println(stringSet.isEmpty());
		
		stringSet.add("s1");
		stringSet.add("s2");
		stringSet.add("s3");
		stringSet.print();
		
		System.out.println(stringSet.contains("s1"));
		
		System.out.println(stringSet.isEmpty());
		
		stringSet.remove("s1");
		
		System.out.println(stringSet.add("s2"));
		
		System.out.println(stringSet.contains("s1"));
		
		stringSet.print();
		
		Queue<String> queue = new QueueImpl<String>();
		
		System.out.println(queue.isEmpty());
		
		queue.add("q1");
		queue.add("q2");
		queue.add("q3");
		
		queue.print();
	
		System.out.println(queue.isEmpty());
		
		System.out.println(queue.size());
		
		String one = queue.peek();
		System.out.println(one);
		
		String two = queue.pop();
		System.out.println(two);
		
		String three = queue.peek();
		System.out.println(three);
		
		System.out.println(queue.size());
	}
}