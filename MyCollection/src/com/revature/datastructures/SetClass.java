package com.revature.datastructures;

public class SetClass<T> implements Set<T> {
	
	T[] array = (T[]) new Object[10];
	int counter = 0;

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (counter == 0)
			return true;
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return counter;
	}

	@Override
	public boolean add(T dataItem) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			if (array[i] == dataItem)
				return false;
		}
		if (counter < array.length) {
			array[counter] = dataItem;
			counter += 1;
			return true;
		}
		else {
			T[] tempArray = (T[]) new Object[array.length * 2];
			for (int i = 0; i < array.length; i++)
				tempArray[i] = array[i];
			array = tempArray;
			array[counter] = dataItem;
			counter += 1;
			return true;
		}
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for (int i = 0; i < counter; i++)
			System.out.println(array[i]);
	}

	@Override
	public void remove(T dataItem) {
		// TODO Auto-generated method stub
		boolean found = false;
		for (int i = 0; i < counter; i++) {
			if (found == true) {
				array[i] = array[i+1];
			}
			if (array[i] == dataItem) {
				array[i] = array[i+1];
				found = true;
			}
		}
		array[counter] = null;
		counter --;
	}

	@Override
	public boolean contains(T dataItem) {
		// TODO Auto-generated method stub
		for (int i = 0; i < counter; i++) {
			if (array[i] == dataItem)
				return true;
		}
		return false;
	}

}
