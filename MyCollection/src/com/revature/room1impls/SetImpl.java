package com.revature.room1impls;

import com.revature.datastructures.Set;

public class SetImpl<T> implements Set<T>{
	private T[] hiddenData;
	//add index = 0
	//remove index = maximum
	public SetImpl(){
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
	public boolean contains(T dataItem) {
		for(T data : this.hiddenData) {
			if(data == dataItem) {
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean add(T dataItem) {
		if(contains(dataItem)) {
			return false;
		}
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

	@Override
	public void remove(T dataItem) {
//		if(!contains(dataItem)) {
//			return;
//		}
		
		for(int i= 0; i < this.hiddenData.length; i++) {
		//for(hiddenData)
			if(this.hiddenData[i] == dataItem) {
				T[] tempArray= (T[]) (new Object[this.hiddenData.length - 1]);
				for( int j= 0; j < i; j++) {
					tempArray[j]= this.hiddenData[j];
				}
				for( int j= i; j < tempArray.length; j++) {
					tempArray[j]= this.hiddenData[j+1];
				}

				this.hiddenData= tempArray;
				return;
			}
				
		}
		
	}


}
