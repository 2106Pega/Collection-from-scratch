package com.revature.datastructures;

class ListIterator<T> implements Iterator<T> {
	
	private ListImpl<T> hiddenDataStructure;
	private int index;
	
	// constructor
	public ListIterator(ListImpl<T> list) {
		this.hiddenDataStructure = list;
		this.index = 0;
	}
	
	// Checks if the next element exists
	public boolean hasNext() {
		return (index < this.hiddenDataStructure.size());
	}
	
	// moves the cursor/iterator to next element
	public T next() {
		T item = this.hiddenDataStructure.itemAtIndex(index);
		index++;
		return item;
	}
	
	// Used to remove an element. Implement only if needed
	public void remove() {
		throw new UnsupportedOperationException();
	}
}