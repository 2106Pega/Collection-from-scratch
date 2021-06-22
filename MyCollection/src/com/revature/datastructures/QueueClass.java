package com.revature.datastructures;

public class QueueClass<T> implements Queue<T> {
	
	T[] array = (T[]) new Object[10];
	int counter = 0;

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (counter == 0)
			return true;
		else return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean add(T dataItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}

}
