package com.revature.datastructures;

public class QueueImpl<T> implements Queue<T> {

    private T[] arr;
    
    public QueueImpl(){
        this.arr = (T[]) new Object[0];
    }
	
	@Override
    public boolean isEmpty() {
        return this.arr.length == 0;
    }

    @Override
    public int size() {
        return this.arr.length;
    }

	@Override
	public boolean add(T dataItem) {
		T[] newArr = (T[]) new Object[this.arr.length + 1];
		
		for (int i = 0; i < this.arr.length; i++) {
			newArr[i] = this.arr[i];
		}
		
		newArr[this.arr.length] = dataItem;
		this.arr = newArr;
		
		return true;
	}

    public void print() {
        for ( T data: this.arr){
            System.out.println(data.toString());
        }
    }

	@Override
	public T pop() {
		if (this.arr.length == 0)
			return null;
		
		T[] newArr = (T[]) new Object[this.arr.length - 1];
		T first = this.arr[0];
		
		for (int i = 1; i < this.arr.length; i++) {
			newArr[i - 1] = this.arr[i];
		}
		
		this.arr = newArr;
		
		return first;
	}

	@Override
	public T peek() {
		if (this.arr.length == 0)
			return null;
		
		return this.arr[0];
	}

}
