package com.org.binaryTree;

public class QueueA {
	private Node[] queueArray;
	private int front;
	private int rear;
	public QueueA() {
		queueArray=new Node[20];
		front=-1;
		rear=-1;
		
	}
	public QueueA(int maxSize) {
		queueArray=new Node[maxSize];
		front=-1;
		rear=-1;
	}
	public void insert(Node data) {
		if(isFull()) {
			System.out.println("queuue is full");
			return;
		}
		if(front==-1) {
			front=0;
		}
		rear=rear+1;
		queueArray[rear]=data;
		
	}
	public Node delete() {
		if(isEmpty())
			return null;
		Node data;
		data=queueArray[front];
		front=front+1;
		return data;
		
	}
	public boolean isEmpty() {
		return(front==-1|| front==rear+1);
	}
	public boolean isFull() {
		return(rear==queueArray.length-1);
	}
}
