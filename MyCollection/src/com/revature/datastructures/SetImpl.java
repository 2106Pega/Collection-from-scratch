package com.revature.datastructures;

public class SetImpl<T> implements Set<T> {
	
	private T[] hiddenDataStructure;
	
	public SetImpl() {
		this.hiddenDataStructure = (T[]) new Object[0];
	}

	@Override
	public boolean isEmpty() {
		return (this.hiddenDataStructure.length == 0);
	}

	@Override
	public int size() {
		return this.hiddenDataStructure.length;
	}

	@Override
	public boolean add(T dataItem) {
		if (!(this.contains(dataItem))) {
		
			// array with new data item added
			T[] newArray = (T[]) new Object[this.hiddenDataStructure.length + 1];
			
			// set all elements of new array except last equal to original array
			for (int i = 0; i < this.hiddenDataStructure.length; i++) {
				newArray[i] = this.hiddenDataStructure[i];
			}
		
			// set last element of array equal to new data item
			newArray[this.hiddenDataStructure.length] = dataItem;
			this.hiddenDataStructure = newArray;
		
			return true;
		}
		
		return false;
	}

	@Override
	public void print() {
		System.out.print("Set: {");
		for (int i = 0; i < this.hiddenDataStructure.length; i++) {
			System.out.print(this.hiddenDataStructure[i]);
			System.out.print(", ");
		}
		System.out.print("}");
	}

	@Override
	public void remove(T dataItem) {
		boolean isInSet = false;
		
		// check if data item is in the set
		for (int i = 0; i < this.hiddenDataStructure.length; i++) {
			if (this.hiddenDataStructure[i].equals(dataItem)) {
				this.hiddenDataStructure[i] = null;
				isInSet = true;
			}
		}
		
		// if the data item is in the set, remove it
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
