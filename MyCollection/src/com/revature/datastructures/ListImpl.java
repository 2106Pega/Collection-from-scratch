package com.revature.datastructures;

public class ListImpl<T> implements List<T> {

	private T[] hiddenDataStructure;
	
	public ListImpl() {
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
		T[] newArray = (T[]) new Object[this.hiddenDataStructure.length + 1];
		
		for (int i = 0; i < this.hiddenDataStructure.length; i++) {
			newArray[i] = this.hiddenDataStructure[i];
		}
		
		newArray[this.hiddenDataStructure.length] = dataItem;
		this.hiddenDataStructure = newArray;
		
		return true;
	}

	@Override
	public void print() {
		System.out.print("List: {");
		for (int i = 0; i < this.hiddenDataStructure.length; i++) {
			System.out.print(this.hiddenDataStructure[i]);
			System.out.print(", ");
		}
		System.out.print("}");
		
	}

	@Override
	public boolean add(T dataItem, int index) {
		T[] newArray = (T[]) new Object[this.hiddenDataStructure.length + 1];
		
		int k = 0;
		for (int i = 0; i < this.hiddenDataStructure.length; i++) {
			if (i != index) {
				newArray[i] = this.hiddenDataStructure[k];
				k++;
			}
		}
		
		newArray[index] = dataItem;
		this.hiddenDataStructure = newArray;
		
		return true;
	}

	@Override
	public boolean addAll(List itemList) {
		T[] newArray = (T[]) new Object[this.hiddenDataStructure.length + itemList.size()];
		
		for (int i = 0; i < this.hiddenDataStructure.length; i++) {
			newArray[i] = this.hiddenDataStructure[i];
		}
		
		for (int i = this.hiddenDataStructure.length; i < (this.hiddenDataStructure.length + itemList.size()); i++) {
			newArray[i] = (T) itemList.itemAtIndex(i - this.hiddenDataStructure.length);
		}
		
		this.hiddenDataStructure = newArray;
		
		return false;
	}

	@Override
	public boolean contains(T s) {
		for (int i = 0; i < this.hiddenDataStructure.length; i++) {
			if (this.hiddenDataStructure[i].equals(s)) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public T itemAtIndex(int index) {
		return this.hiddenDataStructure[index];
	}

	@Override
	public int indexOf(T item) {
		for (int i = 0; i < this.hiddenDataStructure.length; i++) {
			if (this.hiddenDataStructure[i].equals(item)) {
				return i;
			}
		}
		
		return -1;
	}

	@Override
	public boolean remove(int index) {
		if (index >= this.hiddenDataStructure.length || index < 0) {
			return false;
		}
		
		T[] newArray = (T[]) new Object[this.hiddenDataStructure.length - 1];
		
		this.hiddenDataStructure[index] = null;
		
		int k = 0;
		for (int i = 0; i < this.hiddenDataStructure.length; i++) {
			if (this.hiddenDataStructure[i] != null) {
				newArray[k] = this.hiddenDataStructure[i];
				k++;
			}
		}
		
		return true;
	}

	@Override
	public boolean remove(T item) {
		int index = -1;
		for (int i = 0; i < this.hiddenDataStructure.length; i++) {
			if (this.hiddenDataStructure[i].equals(item)) {
				index = i;
			}
		}
		
		return this.remove(index);

	}

	@Override
	public void removeAll() {
		T[] newArray = (T[]) new Object[0];
		this.hiddenDataStructure = newArray;
		
	}

}
