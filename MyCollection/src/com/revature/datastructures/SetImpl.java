package com.revature.datastructures;

public class SetImpl<T> implements Set<T>{

    private T[] arr;
    
    public SetImpl(){
        this.arr = (T[]) new Object[0];
 
    }
 
    @Override
    public void remove(T dataItem) {
 
        if ( this.contains(dataItem) ){
 
            T[] newArr = (T[]) new Object[this.arr.length-1];
 
 
            int holder = -1;
            for ( int i =0; i < this.arr.length; i++){
                if ( this.arr[i] == dataItem){
                    holder = i +1;
                    break;
                }
                newArr[i] = this.arr[i];
            }
 
            for ( int i = holder; i < this.arr.length; i++){
                newArr[i-1] = this.arr[i];
 
            }
 
            this.arr = newArr;
 
        }
 
    }
 
    @Override
    public boolean contains(T dataItem) {
        for ( T inArr: this.arr){
            if ( inArr.equals(dataItem) ){
                return true;
            }
        }
        return false;
    }
 
    @Override
    public boolean isEmpty() {
        return this.arr.length ==0;
    }
 
    @Override
    public int size() {
        return this.arr.length;
    }
 
    @Override
    public boolean add(T dataItem) {
 
        if ( this.contains(dataItem) ){
            return false;
        }
        int currentSize = this.arr.length;
 
        T[] newArr = (T[]) new Object[currentSize+1];
        for ( int i = 0; i < currentSize; i++){
            newArr[i] = this.arr[i];
        }
        newArr[newArr.length-1] = dataItem;
        this.arr = newArr;
 
 
        return true;
    }
 
    @Override
    public void print() {
 
        for ( T data: this.arr){
            System.out.println(data.toString());
        }
 
    }

	
}
