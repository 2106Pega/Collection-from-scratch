package com.revature.datastructures;

public interface List<T> extends Collection<T> {

	
	public boolean add(T dataItem, int index);
	
	public boolean addAll(List itemList);
	
	public boolean contains(T s);
	
	public T itemAtIndex(int index);
	
	public int indexOf(T item);
	
	public boolean remove(int index);
	
	public boolean remove(T item);
	
	public void removeAll();
	
	
}
