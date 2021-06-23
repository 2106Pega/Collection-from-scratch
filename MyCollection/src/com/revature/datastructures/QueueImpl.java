package com.revature.datastructures;

public class QueueImpl<T> implements Queue<T>{

	private T[] hiddenDataStructure;
	
	public QueueImpl() {
		this.hiddenDataStructure = (T[]) new Object[0];
	}
	@Override
	public boolean isEmpty() {
		return this.hiddenDataStructure.length == 0;
	}

	@Override
	public int size() {
		return this.hiddenDataStructure.length;
	}

	@Override
	public boolean add(T dataItem) {
		T[] newArray = (T[]) new Object[this.hiddenDataStructure.length + 1];
		
		for(int i = 0; i < this.hiddenDataStructure.length; i++)
			newArray[i] = this.hiddenDataStructure[i];
		
		newArray[this.hiddenDataStructure.length] = dataItem;
		this.hiddenDataStructure = newArray;
		
		return true;
	}

	@Override
	public void print() {
		System.out.print("Queue: (");
		for(int i = 0; i < this.hiddenDataStructure.length; i++) {
			System.out.print(this.hiddenDataStructure[i] + ", ");
		}
		System.out.print(")");	
	}

	@Override
	public T pop() {
		// Return null if it's empty
		if(this.isEmpty())
			return null;
		
		// Otherwise, create a new array with head item removed
		T[] newArray = (T[])new Object[this.hiddenDataStructure.length - 1];
		// Stores the head into a temporary variable to return
		T dataItem = this.hiddenDataStructure[0];
		
		// Reassign values except the head value
		for(int i = 1; i < this.hiddenDataStructure.length; i++) {
			newArray[i-1] = this.hiddenDataStructure[i]; 
		}
		
		this.hiddenDataStructure = newArray;
		return dataItem;
	}

	@Override
	public T peek() {
		// Return the first value or return null if it's empty
		if(this.isEmpty())
			return null;
		return this.hiddenDataStructure[0];
	}
	// Hello
	
}
