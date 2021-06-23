package com.revature.datastructures;

public class SetImpl<T> implements Set<T> {
	
	private T [] hiddenDataStructure;
	
	public SetImpl(){
		this.hiddenDataStructure = (T[]) new Object[0];
		// Java doesn't allow to create an array of generic type, but they allow to create an Object.
	}

	@Override
	public boolean isEmpty() {
		return this.hiddenDataStructure.length == 0;
	}

	@Override
	public int size() {
		return this.hiddenDataStructure.length;
	}

	@Override
	public boolean add(T dataItem) {
		if(!this.contains(dataItem)) {
			// Array with new data item added
			T[] newArray = (T[])new Object[this.hiddenDataStructure.length + 1];
			
			// Set all elements of new array from hiddenDataStructure
			for(int i = 0; i < this.hiddenDataStructure.length; i++) {
				newArray[i] = this.hiddenDataStructure[i];
			}
			
			// The new data is added at the end of newArray and replace hiddenDataStructure with with newArray
			newArray[this.hiddenDataStructure.length - 1] = dataItem;
			this.hiddenDataStructure = newArray;
			
			return true;
		}
		return false;
	}

	@Override
	public void print() {
		System.out.print("Set: {");
		for(int i = 0; i < this.hiddenDataStructure.length; i++) {
			System.out.print(this.hiddenDataStructure[i] + ", ");
		}
		System.out.print("}");
	}

	@Override
	public void remove(T dataItem) {
		boolean isInSet = false;
		
		// Check whether it contains dataItem or not.
		for(int i = 0; i < this.hiddenDataStructure.length; i++) {
			if(this.hiddenDataStructure[i].equals(dataItem)) {
				this.hiddenDataStructure[i] = null;
				isInSet = true;
			}
		}
		
		if(isInSet) {
			// Remove the given dataItem and create a new array that doesn't contain dataItem
			T[] newArray = (T[]) new Object[this.hiddenDataStructure.length - 1];
			int k = 0;
			for(int i = 0; i < this.hiddenDataStructure.length; i++) {
				if(!(this.hiddenDataStructure[i].equals(null))) {
					newArray[k] = this.hiddenDataStructure[i];
					k++;
				}
			}
			this.hiddenDataStructure = newArray;
		}
	}

	@Override
	public boolean contains(T dataItem) {
		// Check whether it contains the data or not.
		for(int i = 0; i < this.hiddenDataStructure.length; i++) {
			if(this.hiddenDataStructure[i].equals(dataItem))
				return true;
		}
		return false;
	}

}
