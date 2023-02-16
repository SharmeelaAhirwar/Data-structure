package com.org.queueCircularLL;

public class QueueCLL {
	private Node rear;
	public QueueCLL() {
		rear=null;
	}
	public boolean isEmpty() {
		return(rear==null);
	}
	public void insert( int data) {
		Node temp=new Node(data);
		if(isEmpty()) {
			rear=temp;	
			rear.link=rear;
		}
		else {
			temp.link=rear.link;
			rear.link=temp;
			rear=temp;
			
		}
	}
		public int delete() {
			if(isEmpty()) {
				System.out.println("queue is empty");
			}
			Node temp;
			if(rear.link==rear) {
				temp=rear;
				rear=null;
				}
			else {
				
			temp=rear.link;
			
			rear.link=temp.link;
			
		}
			return temp.info;
		}
		public int peek() {
			if(isEmpty()) {
				System.out.println("queue is empty");
			}
			return rear.link.info;
		}
		public void display() {
			if(isEmpty()) {
				System.out.println("queueu is empty :");
				return;
			}
			Node p=rear.link;
			do {
				System.out.println(p.info +" ");
				p=p.link;
				
			}while(p!=rear.link);
			System.out.println();
			
		}
		
		
		
		public int size() {
			if(isEmpty())
				return 0;
			int s=0;
			Node p=rear.link;
			do {
				s++;
				p=p.link;
			}while(p!=rear.link);
			return s;
		}
		
	
		
	}


