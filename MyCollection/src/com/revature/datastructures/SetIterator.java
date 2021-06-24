package com.revature.datastructures;

public class SetIterator<T> implements Iterator<T> {

	private SetImpl<T> hiddenDataStructure;
	private int index;
	
	// constructor
	public SetIterator(SetImpl<T> set) {
		this.hiddenDataStructure = set;
		this.index = 0;
	}
	
	// Checks if the next element exists
	public boolean hasNext() {
		return (index < this.hiddenDataStructure.size());
	}
	
	// moves the cursor/iterator to next element
	public T next() {
		T item = this.hiddenDataStructure.toArray()[index];
		index++;
		return item;
	}
	
	// Used to remove an element. Implement only if needed
	public void remove() {
		throw new UnsupportedOperationException();
	}
	
}
