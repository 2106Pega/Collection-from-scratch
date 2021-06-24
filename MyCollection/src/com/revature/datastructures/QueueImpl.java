package com.revature.datastructures;

public class QueueImpl<T> implements Queue<T> {

	private T[] hiddenDataStructure;
	
	public QueueImpl() {
		this.hiddenDataStructure = (T[]) new Object[0];
	}
	
	public Iterator<T> iterator() {
		return new QueueIterator<T>(this);
	}
	
	@Override
	public boolean isEmpty() {
		return (this.hiddenDataStructure.length == 0);
	}

	@Override
	public int size() {
		return this.hiddenDataStructure.length;
	}

	@Override
	public boolean add(T dataItem) {
		
		// array with new data item added
		T[] newArray = (T[]) new Object[this.hiddenDataStructure.length + 1];
		
		// set all elements of new array except last equal to original array
		for (int i = 0; i < this.hiddenDataStructure.length; i++) {
			newArray[i] = this.hiddenDataStructure[i];
		}
		
		// set last element of array equal to new data item
		newArray[this.hiddenDataStructure.length] = dataItem;
		this.hiddenDataStructure = newArray;
		
		return true;
	}

	@Override
	public void print() {
		System.out.print("Queue: {");
		for (int i = 0; i < this.hiddenDataStructure.length - 1; i++) {
			System.out.print(this.hiddenDataStructure[i]);
			System.out.print(", ");
		}
		System.out.print(this.hiddenDataStructure[this.hiddenDataStructure.length - 1]);
		System.out.println("}");
		
	}

	@Override
	public T pop() {
		if (this.isEmpty()) {
			return null;
		}
		
		// new array with head item removed
		T[] newArray = (T[]) new Object[this.hiddenDataStructure.length - 1];
		
		// get item at head of queue to return
		T dataItem = this.hiddenDataStructure[0];
		
		// reassign values
		for (int i = 1; i < this.hiddenDataStructure.length; i++) {
			newArray[i - 1] = this.hiddenDataStructure[i];
		}
		
		this.hiddenDataStructure = newArray;
		return dataItem;
	}

	@Override
	public T peek() {
		if (this.isEmpty()) {
			return null;
		}
		
		return this.hiddenDataStructure[0];
	}

	
	
	
}
