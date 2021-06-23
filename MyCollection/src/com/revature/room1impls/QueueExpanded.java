package com.revature.room1impls;

import java.util.Iterator;

public class QueueExpanded<T> extends QueueImpl<T> implements Iterable<T> {
	 
	 private int counter = 0;
	 private T[] hiddenData;
	 private int counter2 = 0;
	 
	public void Copy() {
		hiddenData = (T[]) new Object[super.size()];
		int g = 0;
		T temp = super.pop();
		while(temp != null) {
			hiddenData[g++] = temp;
			temp = super.pop();
		}
	}

	public void Repopulate(T) {
		for(int i = 0; i < hiddenData.length; i++) {
			super.add(T);
		}
	}
	
	
	
	@Override
	public Iterator<T> iterator() {
		this.Copy();
		counter = 0;
		return new Iterator<T>(){

			@Override
			public boolean hasNext() {
				return (counter <= hiddenData.length - 1);
			}

			@Override
			public T next() {
				return hiddenData[counter++];
			}		
		};
	}
}
