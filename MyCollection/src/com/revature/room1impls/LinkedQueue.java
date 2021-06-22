package com.revature.room1impls;

import com.revature.datastructures.Queue;

public class LinkedQueue<T> implements Queue<T> {
	//each node contains an item and a link to the next node
	class Node{
		public T item;
		public Node next;
		Node(T item){
			this.item= item;
			this.next= null;
		}
	}
	
	//we only need to track the first and last nodes
	private Node first= null;
	private Node last= null;
	private int count= 0;
	@Override
	public boolean isEmpty() {
		//if the first node is null the list is empty
		return (this.first == null);
	}

	@Override
	public int size() {
		return this.count;
	}

	@Override
	public boolean add(T dataItem) {
		if(this.isEmpty()) {
			//if the first item is null the list is empty
			//both first and last need to be set
			this.first= new Node(dataItem);
			this.last= this.first;
		}else {
			//otherwise we add a node after the last one
			this.last.next = new Node(dataItem);
			//and update the last pointer to that new node
			this.last= this.last.next;
		}
		this.count++;
		return false;
	}

	@Override
	public void print() {
		for(Node n= this.first; n != null; n= n.next) {
			System.out.println(n.item.toString());
		}
	}

	@Override
	public T pop() {
		if(this.isEmpty()) {
			return null;
		}
		//grab the first item
		T item= peek();
		//move the pointer to the first item up
		this.first= this.first.next;
		this.count--;
		return item;
	}

	@Override
	public T peek() {
		//if the list is empty return null otherwise return the first item
		return (this.isEmpty())?(null):(this.first.item);
	}

}
