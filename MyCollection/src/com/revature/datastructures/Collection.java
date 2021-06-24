package com.revature.datastructures;

public interface Collection<T> extends Iterable<T> {
	
	public boolean isEmpty();
	
	public int size();
	
	public boolean add(T dataItem);
	
	public void print();
	
	

}