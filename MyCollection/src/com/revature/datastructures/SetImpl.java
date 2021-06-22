package com.revature.datastructures;

public class SetImpl<T> implements Set<T> {
	
	private T[] hiddenDataStructure;
	
	public SetImpl() {
		this.hiddenDataStructure = (T[]) new Object[0];
	}

	@Override
	public boolean isEmpty() {
		if (this.hiddenDataStructure.length == 0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return this.hiddenDataStructure.length;
	}

	@Override
	public boolean add(T dataItem) {
		if (!(this.contains(dataItem))) {
		
			T[] newArray = (T[]) new Object[this.hiddenDataStructure.length + 1];
			for (int i = 0; i < this.hiddenDataStructure.length; i++) {
				newArray[i] = this.hiddenDataStructure[i];
			}
		
			newArray[this.hiddenDataStructure.length] = dataItem;
			this.hiddenDataStructure = newArray;
		
			return true;
		}
		
		return false;
	}

	@Override
	public void print() {
		System.out.print("{");
		for (int i = 0; i < this.hiddenDataStructure.length; i++) {
			System.out.print(this.hiddenDataStructure[i]);
			System.out.print(", ");
		}
		System.out.print("}");
	}

	@Override
	public void remove(T dataItem) {
		boolean isInSet = false;
		
		for (int i = 0; i < this.hiddenDataStructure.length; i++) {
			if (this.hiddenDataStructure[i].equals(dataItem)) {
				this.hiddenDataStructure[i] = null;
				isInSet = true;
			}
		}
		
		if (isInSet) {
			T[] newArray = (T[]) new Object[this.hiddenDataStructure.length - 1];
			int k = 0;
			for (int i = 0; i < this.hiddenDataStructure.length; i++) {
				if (!(this.hiddenDataStructure[i] == null)) {
					newArray[k] = this.hiddenDataStructure[i];
					k++;
				}
			}
			
			this.hiddenDataStructure = newArray;
		}
		
	}

	@Override
	public boolean contains(T dataItem) {
		for (int i = 0; i < this.hiddenDataStructure.length; i++) {
			if (this.hiddenDataStructure[i].equals(dataItem)) {
				return true;
			}
		}
		
		return false;
	}

}
