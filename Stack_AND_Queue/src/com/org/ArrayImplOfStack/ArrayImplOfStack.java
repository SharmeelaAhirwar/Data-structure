package com.org.ArrayImplOfStack;

public class ArrayImplOfStack {
	private int[] stackArray;
	private int top;
	public ArrayImplOfStack() {
		stackArray =new int[10];
		top=-1;
	}
	public ArrayImplOfStack(int maxSize) {
		stackArray =new int[maxSize];
		top=-1;
	}
	public int sizeOfStack() {
		return top+1;
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public boolean isFull() {
		return(top==stackArray.length-1);
	}
	public void push(int data) {
		if(isFull()) {
			System.out.println("stack overflow");
			return;
		}
		top=top+1;
		stackArray[top]=data;
	}
	public  int pop() {
		int x;
		if(isEmpty()) {
			System.out.println("stack underflow");
			
		}
		x=stackArray[top];
		top=top-1;
		return x;
	}
	public int peek() {
		int x;
		if(isEmpty()) {
			System.out.println("stack underFlow");
		}
		x=stackArray[top];
		return x;//return stackArray[top]
	}
	public void display() {
		int i;
		if(isEmpty()) {
			System.out.println("stack underflow");
			return;
		}
		System.out.println("stack are : ");
		for(i=top;i>=0;i--) {
			System.out.println(stackArray[i]+" ");
		}
		System.out.println();
		
	}
	

}
