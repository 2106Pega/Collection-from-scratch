package com.revature.datastructures;

import java.util.NoSuchElementException;

public class QueueImpl<T> implements Queue<T> {
	
	private class Element{
		private T item;	
		private Element next;	
	}
	
	private int n;	//size of queue
	
	private Element first;	//beginning of queue
	
	private Element last;	//end of queue
	
	//private T[] hiddenDataStructure = (T[]) new Object[0];

	
	
	public QueueImpl() {
		first = null;
		last = null;
		n = 0;
		}
	
	/*public QueueImpl(int i) {   for creating a capacity-restricted queue
		
	}*/

	@Override
	public boolean isEmpty() {

		return first == null;
	}

	@Override
	public int size() {

		return n;
	}

	@Override
	public boolean add(T dataItem) {
		Element oldLast = last;
		last = new Element();
		last.item = dataItem;
		last.next = null;
		
		if(isEmpty()) { first = last;}
		else oldLast.next = last;
		n++;
		return true;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T pop() {
		T item = first.item;
		first = first.next;
		n--;
		if(isEmpty()) {last = null;}
		
		return item;
		
		
	}
	
	public T remove() {
		
		if(isEmpty()) throw new NoSuchElementException();
		T item = first.item;
		first = first.next;
		n--;

		return item;
		
		
	}

	@Override
	public T peek() {
		
		return first.item;
		
	}
	
	public T element() {
		if(isEmpty()) throw new NoSuchElementException();
		
		return first.item;
	}
	

}
