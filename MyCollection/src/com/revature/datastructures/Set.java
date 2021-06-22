package com.revature.datastructures;

import java.util.Iterator;

public interface Set<T> extends Collection<T> {
	
	public void remove(T dataItem);
	
	public boolean contains(T dataItem);
	
	//public boolean addAll(Collection<? extends T >c);
	
	public void clear();
	
	//public boolean containsAll(Collection<?>c);
	
	public boolean equal(T o);
	
	//public int hashCode();
	
	public boolean isEmpty();
	
	public boolean add(T dataItem);
	
	public Iterator<T> iterator();
	
	

}
