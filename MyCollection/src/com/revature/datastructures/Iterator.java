package com.revature.datastructures;

public interface Iterator<T> {
	
	boolean hasNext();
	
	T next();
	
	void remove();
	
}
