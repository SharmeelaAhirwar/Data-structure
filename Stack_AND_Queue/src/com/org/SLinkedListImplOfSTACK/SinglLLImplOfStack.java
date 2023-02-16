package com.org.SLinkedListImplOfSTACK;

public class SinglLLImplOfStack {
	private Node top;
	public SinglLLImplOfStack() {
		top=null;
	}
	public int size() {
		int s=0;
		Node p=top;
		while(p!=null) {
			p=p.link;
			s++;
		}
		return s;
	}
	public void push(int data) {
		Node temp=new Node(data);
		temp.link=top;
		top=temp;
		
	}
	public boolean isEmpty() {
		return(top==null);
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack underFlow");
			
		}
		int x=top.info;
		top=top.link;
		return x;
		
	}
	public int peak() {
		if(isEmpty()) {
			System.out.println("stack underFlow");
		}
		 int x=top.info;
		return x;
	}
	public void display() {
		Node p;
		if(isEmpty()) {
			System.out.println("stack is empty");
		}
		p=top;
		while(p!=null) {
			System.out.println(p.info +" ");
			p=p.link;
		}
		System.out.println();
	}

}
