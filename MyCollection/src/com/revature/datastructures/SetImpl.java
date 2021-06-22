package com.revature.datastructures;

import java.util.Iterator;

public class SetImpl<T> implements Set<T> {
	
	

	private T[] hiddenDataStructure;
	
	public SetImpl() {
		T[] hiddenDataStructure = (T[]) new Object[10];
	}
	
	public SetImpl(int i ) {
		T[] hiddenDataStructure = (T[]) new Object[i];
		
	}

	@Override
	public boolean isEmpty() {
		if(this.hiddenDataStructure.length == 0) {
			return true;
		}
		else 	return false;
	}

	@Override
	public int size() {
		
		return this.hiddenDataStructure.length;
	}

	@Override
	public boolean add(T dataItem) {
		
		return false;
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove(T dataItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(T dataItem) {
		
	/*	for(T c: hiddenDataStructure) {
			c instanceof T
		}*/
		
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean equal(T o) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterator<T> iterator() {
		
		return null;
	}

}
