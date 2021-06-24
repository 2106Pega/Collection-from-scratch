package com.revature.datastructures;

public class QueueIterator<T> implements Iterator<T> {
	
	private QueueImpl<T> hiddenDataStructure;
	
	// constructor
	public QueueIterator(QueueImpl<T> queue) {
		this.hiddenDataStructure = queue;
	}
	
	// Checks if the next element exists
	public boolean hasNext() {
		return (this.hiddenDataStructure.peek() != null);
	}
	
	// moves the cursor/iterator to next element
	public T next() {
		T item = this.hiddenDataStructure.pop();
		this.hiddenDataStructure.add(item);
		return item;
	}
	
	// Used to remove an element. Implement only if needed
	public void remove() {
		throw new UnsupportedOperationException();
	}
}