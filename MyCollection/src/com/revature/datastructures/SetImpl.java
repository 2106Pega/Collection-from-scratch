package com.revature.datastructures;

public class SetImpl<T> implements Set<T>{

	private int size;
	
	private final int STARTSIZE = 10;
	
	private T[] hiddenArray;
	
	public SetImpl() {
		size = 0;
		this.hiddenArray = (T[]) new Object[STARTSIZE];
//		hiddenArray = new Set[10];
	}
	
	@Override
	public boolean isEmpty() {
		if (size == 0)
			return true;
		
		return false;
	}

	@Override
	public int size() {
		return size;
//		return hiddenArray.length;
	}

	@Override
	public boolean add(Object dataItem) {
		int temp = 0;
		while (this.hiddenArray[temp] != null) {
			temp += 1;
		}
		this.hiddenArray[temp] = dataItem;
		return false;
	}

	@Override
	public void print() {
		for(int i = 0; i < this.hiddenArray.length; i++) {
			if (this.hiddenArray[i] != null)
				System.out.println(this.hiddenArray[i].toString());
		}
	}

	@Override
	public void remove(Object dataItem) {
		Collection<T>[] newArray
		
	}

	@Override
	public boolean contains(Object dataItem) {
		for(int i = 0; i < index; i++) {
			if (this.hiddenArray[i].equals(dataItem))
				return true;
		}
		return false;
	}

	
}
