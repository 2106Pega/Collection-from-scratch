package com.revature.room1impls;

import java.util.Iterator;

public class QueueExpanded<T> extends QueueImpl<T> implements Iterable<T> {
	 private T[] hiddenData = (T[]) (new Object[super.size()]);
	 private int counter = 0;
	 
	 
	QueueExpanded(){
		super();
		//hiddenData = {"hello", "world", "Next"}
		System.out.println(super.peek());
		for(int i = 0; i < super.size(); i++) {
			hiddenData[i] = super.pop();	
		}
	}

	
//	@Override
//	public boolean hasNext() {
//		return (counter <= hiddenData.length - 1);
//	}
//
//	@Override
//	public T next() {
//		if(this.hasNext())
//		{
//			System.out.println(counter);
//			return hiddenData[counter++];	
//		}		
//		return null;
//	}


	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<T>(){

			@Override
			public boolean hasNext() {
				return (counter <= hiddenData.length - 1);
			}

			@Override
			public T next() {
				if(this.hasNext())
				{
					System.out.println(counter);
					return hiddenData[counter++];	
				}		
				return null;
			}
			
		};
	}

}
