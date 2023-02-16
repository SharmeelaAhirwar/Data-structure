package com.org.CircularQueue;

public class CircularQueueA {
	private int [] queueArray;
	private int front;
	private int rear;
	public CircularQueueA() {
		queueArray=new int[5];
		front=-1;
		rear=-1;
	}
	public CircularQueueA(int maxSize) {
		queueArray=new int[maxSize];
		front=-1;
		rear=-1;
		
	}
	public boolean isEmpty() {
		return(front==-1);
	}
	public boolean isFull() {
		return((front==0 && rear==queueArray.length-1)||(front==rear+1));
	}
	public void insert(int data) {
		if(isFull()) {
			System.out.println("queue is overFlow");
			return;
		}
		if(front==-1)
			front=0;
		if(rear==queueArray.length-1)
			rear=0;
		else {
			rear=rear+1;
		}
		queueArray[rear]=data;
	}
	public int delete() {
		if(isEmpty()) {
			System.out.println("queue underFlow ");
		}
		int x=queueArray[front];
		if(front==rear) //queuue has only one element
		{
			front=-1;
			rear=-1;
		}
		else if(front==queueArray.length-1)
			front=0;
		else
			front=front+1;
		return x;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("queue undderflow");
		}
		return queueArray[front];
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("queue is empty");
		}
		System.out.println("queuue are : ");
		int i=front;
		if(front<=rear) {
			while(i<=rear)
				System.out.println(queueArray[i++] +" ");	
		}
		else {
			while(i<=queueArray.length-1) {
				System.out.println(queueArray[i++]+" ");
			}
			i=0;
			while(i<=rear) {
				System.out.println(queueArray[i++] + " ");
			}
		}
		System.out.println();
	}
	public int size() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return 0;
		}
		if(isFull())
			return queueArray.length;
		int i=front;
		int sz=0;
		if(front<=rear) {
			while(i<=rear) {
				sz++;
				i++;
			}
		
		}
		else {
			while(i<=queueArray.length-1) {
				sz++;
				i++;
			}
			i=0;
			while(i<=rear) {
				sz++;
				i++;
			}
		}
		return sz;
		
	}

}
