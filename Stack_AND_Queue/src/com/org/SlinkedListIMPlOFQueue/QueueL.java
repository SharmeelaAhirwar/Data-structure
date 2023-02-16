package com.org.SlinkedListIMPlOFQueue;

public class QueueL {
	private Node front;
	private Node rear;

	public QueueL() {
		front = rear = null;
	}

	public int size() {
		int s = 0;
		Node p = front;
		while (p != null) {
			s++;
			p = p.link;
		}
		return s;

	}

	public void insert(int data) {
		Node temp;
		temp=new Node(data);
		if(front==null) {
			front=temp;
//			rear=temp;
			
		}
			
		else {
			rear.link=temp;
			
		}
		rear=temp;
	}
		 public boolean isEmpty(){
			return (front==null);
		}
		public int delete() {
			if(isEmpty())
			{
				System.out.println("queue is empty");
			}
			int x=front.info;
			front=front.link;
			return x;
			
		}
		public int peek() {
			if(isEmpty()) {
				System.out.println("queue is empty");
			}
			return front.info;
		}
		public void display() {
			Node p;
			if(isEmpty()) {
				System.out.println("queue is empty");
			}
			p=front;
			while(p!=null) {
				System.out.println(p.info +" ");
				p=p.link;
			}
		}
		
	}


