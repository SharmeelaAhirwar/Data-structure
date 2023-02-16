package com.org.ArrayImplQueue;

import java.util.NoSuchElementException;

public class QueueA {
	private int[] queueArayy;
	private int front;
	private int rear;
	public QueueA() {
		queueArayy=new int[10];
		front=-1;
		rear=-1;
		
	}
	public QueueA(int maxSize) {
		queueArayy=new int[maxSize];
		front=-1;
		rear=-1;
	}
  public boolean isEmpty() {
	  return(front==-1|| front==rear+1);
  }
  public boolean isFull() {
	  return(rear==queueArayy.length-1);
  }
  public int size() {
	  if(isEmpty())
		  return 0;
	  else
		  return rear-front+1;
  }
  public void insert(int data) {
	  if(isFull()) {
		  System.out.println("queue is over flow");
		  return;
	  }
	  if(front==-1)
		  front=0;
	  rear=rear+1;
	  queueArayy[rear]=data;
	  
  }
  public int delete() {
	  if(isEmpty()) {
		  System.out.println("queue is empty");
		  return 0;
	  }
	  int x=queueArayy[front];
	  front=front+1;
	  return x;
  }
  public int peek() {
	  if(isEmpty()) {
		  System.out.println("queue is empty");
		  throw new NoSuchElementException();
	  }
	  return queueArayy[front];
  }
  public void display() {
	  int i;
	  if(isEmpty()) {
		  System.out.println("queue is empty");
		  return;
	  }
	  System.out.println("queue are :");
	  for(i=front;i<=rear;i++) {
		  System.out.println(queueArayy[i]+" ");
	  }
	  System.out.println();
  }
  
}
