package com.org.Dequeue;

public class DequeueA {
	private int[] queueArray;
	private int front;
	private int rear;

	public DequeueA() {
		queueArray = new int[10];
		front = -1;
		rear = -1;
	}

	public DequeueA(int maxSize) {
		queueArray = new int[maxSize];
		front = -1;
		rear = -1;
	}

	public boolean isEmpty() {
		return (front == -1);
	}

	public boolean isFull() {
		return ((front == 0 && rear == queueArray.length - 1) || (front == rear + 1));
	}
	public void insertFront(int data) {
		if(isFull()) {
			System.out.println("dequeeue is full");
		}
		if(front==-1) {
			front=0;
			rear=0;
		}
		else if(front==0) {
			front=queueArray.length-1;
		}
		else
			front=front=-1;
		queueArray[front]=data;
	}
	public void insertRear(int data) {
		if(isFull()) {
			System.out.println("deque is full");
			return;
		}
		if(front==-1)
			front=0;
		if(rear==queueArray.length-1) {
			rear=0;
		}
		else
			rear=rear+1;
		queueArray[rear]=data;
		
	}
	public int deleteFromFont() {
		if(isEmpty()) {
			System.out.println( "dequeue is empty");
			return 0;
		}
	int x=queueArray[front];
	if(front==rear) { //if Dequeue has only one element
		front=-1;
		rear=-1;
	}
	if(front==queueArray.length-1)
		front=0;
	else
		front=front+1;
	return x;
	}
	public int deletefromRear() {
		if(isEmpty()) {
			System.out.println("quue is empy");
			return 0;
			
		}
		int x=queueArray[rear];
		if(rear==front) {
			front=-1;
			rear=-1;
		}
		else if(rear==0) {
			rear=queueArray.length-1;
		}
		else {
			rear=rear-1;
		}
		return x;
	}
	public void display()
	{
		if(isEmpty()) {
			System.out.println("queue is empty");
			return;
		}
		int i;
		System.out.println("dequeue is  : ");
		i=front;
		if(front<=rear) {
			while(i<=rear) {
				System.out.println(queueArray[i++]+" ");
			}
		}
		else {
			while(i<=queueArray.length-1)
				System.out.println(queueArray[i++]+" ");
			i=0;
			while(i<=rear)
				System.err.println(queueArray[i++]+" ");
		}
		System.out.println();
	}

}
