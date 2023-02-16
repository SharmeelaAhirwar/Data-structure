package com.org.priorityQueue;

public class PriorityQueue {
	private Node front;
	public PriorityQueue() {
		front=null;
	}
	public boolean isEmpty() {
		return(front==null);
		
	}
	public void insert(int data,int pr) {
		Node temp,p;
		temp=new Node(data,pr);
		//quuee is empty or elelmnt to be inserted has high priority than first node
		if(isEmpty()|| pr<front.priority) {
			temp.link=front;
			front=temp;
			
		}
		else {
			p=front;
			while(p.link!=null && p.link.priority<=pr) {
				p=p.link;
			}
			temp.link=p.link;
			p.link=temp;
		}
		
		
	}
	public int delete() {
		int x;
		if(isEmpty()) {
			System.out.println("queue is empty");
			
		}
		
			x=front.info;
			front=front.link;
		
		return x;
	}
	public void display() {
		Node p=front;
		if(isEmpty()) {
			System.out.println("queue is empty");
		}
		else {
			System.out.println("queue is : ");
			while(p!=null) {
				System.out.println(p.info+"                 "+p.priority);
				p=p.link;
				
			}
		}
		System.out.println();
	}

}
