package com.revature.room1impls;

import java.lang.reflect.Array;

import com.revature.datastructures.Queue;

public class QueueImpl<T> implements Queue<T> {
	private T[] hiddenData;
	//add index = 0
	//remove index = maximum
	public QueueImpl(){
		this.hiddenData = (T[]) (new Object[0]);
	}
	@Override
	public boolean isEmpty() {
		return (this.hiddenData.length == 0);
	}
	@Override
	public int size() {
		return this.hiddenData.length;
	}
	@Override
	public boolean add(T dataItem) {
		//add item at index 0
		T[] tempArray= (T[]) (new Object[this.hiddenData.length + 1]);
		for(int i= 0; i < this.hiddenData.length; i++) {
			tempArray[i]= this.hiddenData[i];
		}
		tempArray[this.hiddenData.length]= dataItem;
		this.hiddenData= tempArray;
		return true;
	}
	@Override
	public void print() {
		for(T data : this.hiddenData) {
			System.out.println(data.toString());
		}
		
	}
	
	private void remove() {
		if(this.isEmpty()) {
			return;
		}
		T[] tempArray= (T[]) (new Object[this.hiddenData.length - 1]);
		for(int i= 0; i < tempArray.length; i++) {
			tempArray[i]= this.hiddenData[i + 1];
		}
		this.hiddenData= tempArray;
	}
	@Override
	public T pop() {
		if(this.isEmpty()) {
			return null;
		}
		T temp= peek();
		remove();
		return temp;
	}
	@Override
	public T peek() {
		if(this.isEmpty()) {
			return null;
		}
		return this.hiddenData[0];
	}
	
}
