package com.revature.datastructures;

public interface List<T> extends Collection<T> {

	
	public boolean add(T dataItem, int index);
	
	public boolean addAll(List itemList);
	
	public boolean contains(String s);
	
	public String itemAtIndex(int index);
	
	public int indexOf(String item);
	
	public boolean remove(int index);
	
	public boolean remove(String item);
	
	public void removeAll();
	
	
}
