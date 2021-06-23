package com.revature.datastructures;

import java.util.Iterator;

public class QueueClass<T> implements Queue<T>, Iterable<T>{
	
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
		return counter;
	}

	@Override
	public boolean add(T dataItem) {
		// TODO Auto-generated method stub
		if (counter < array.length) {
			array[counter] = dataItem;
			counter += 1;
		}
		else {
			T[] tempArray = (T[]) new Object[array.length * 2];
			for (int i = 0; i < array.length; i++)
				tempArray[i] = array[i];
			array = tempArray;
			array[counter] = dataItem;
			counter += 1;
		}
		return true;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for (int i = 0; i < counter; i++)
			System.out.println(array[i]);
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		T removeItem = array[0];
		for (int i = 0; i < counter; i++) {
			array[i] = array[i+1];
			}
		array[counter] = null;
		counter --;
		return (String) removeItem;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return (String) array[0];
	}
	//Chris Yarnot, Benjamin Yuan, Zibin Dong, Jim Strange, Paul Karas
	@Override
	public Iterator<T> iterator() {
		return new QueueIter();
	}
	public class QueueIter implements Iterator<T>{
		int i = 0;
		@Override
		public boolean hasNext() {
			return i < counter;
		}

		@Override
		public T next() {
			if(hasNext()) {
				return array[i++];
			}
			return null;
		}
	}
}
