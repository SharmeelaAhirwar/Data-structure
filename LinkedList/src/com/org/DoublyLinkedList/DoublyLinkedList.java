package com.org.DoublyLinkedList;

import java.util.Scanner;

public class DoublyLinkedList {
	private Node start;

	public DoublyLinkedList() {
		start = null;
	}
	//insertion in the begining of list
	public void insertAtBegining(int data) {
		Node p,temp;
//		if(start==null) { 
//			temp=new Node(data);
//			start=temp;	
//		}
		temp=new Node(data);
		temp.next=start;
		start.prev=temp;
		start=temp;
	}
	//insert At the end
	public void insertAtEnd(int data) {
		Node p,temp;
		if(start==null) { //optional
			temp=new Node(data);
			start=temp;
			
		}
		p=start;
		while(p.next!=null) {
			p=p.next;
		}
		temp=new Node(data);
		p.next=temp;
		temp.prev=p;
		
		
	}
	//insertion after a node
	public void insertAfterANode(int data,int x) {
		Node p,temp;
		
		
		p=start;
		while(p!=null) {
			if(p.info==x)
				break;
			p=p.next;
		}
		if(p==null)
		{
			System.out.println("not found");
		}
		else
		{
			temp=new Node(data);
			temp.prev=p;
			temp.next=p.next;
			if(p.next!=null)
			      p.next.prev=temp;// should not be done when p refers to last node
			p.next=temp;
		}
	}
	//insertion before a node
	public void insertBeforeANode(int data,int x) {
		Node p,temp;
		if(start==null)
		{
			System.out.println("list is empty");
		}
		if(start.info==x) {
			temp=new Node(data);
			temp.next=start;
			start.prev=temp;
			start=temp;
			
		}
		p=start;
		while(p!=null) {
			if(p.info==x)
				break;
			p=p.next;
		}
		if(p==null)
			System.out.println("not found");
		
		else
		{
			temp=new Node(data);
			temp.prev=p.prev;
			temp.next=p;
			p.prev.next=temp;
			p.prev=temp;
		}
	}
	//delete first node
	public void deleteFirstNode() {
		if(start==null) {
			System.out.println("list is empty");
		}
		if(start.next==null) {
			start=null;
		}
		start=start.next;
		start.prev=null;
	}
	//deletion of last node
	public void deleteLastNode() {
		if(start==null) {
			System.out.println("list is empty");
		}
		if(start.next==null)
			start=null;
		 Node p=start;
		 while(p.next!=null) {
			p=p.next;
		 }
		 p.prev.next=null;
	}
	//delete particular Node
	public void deleteNode(int x) {
		if(start==null)
			return;
		if(start.next==null) { //list has only one node
			if(start.info==x)
				start=null;
			else
				System.out.println("not found");
		}
		if(start.info==x) {
			start=start.next;
			start.prev=null;
			return;
		}
		 Node p=start;
		while(p.next!=null) {
			if(p.info==x)
				break;
			p=p.next;
		}
		if(p.next!=null) //node to be deleted in between
		{
			p.prev.next=p.next;
			p.next.prev=p.prev;
		}
		else { //p refers to last node
			if(p.info==x) //node to be deleted is last node
				p.prev.next=null;
			else
				System.out.println("not found");
			
		}
	}
		
		//reverse list
		public void reverseLIst() {
			if(start==null)
				return;
			Node p1=start;
			Node p2=start.next;
			p1.next=null;
			p1.prev=p2;
			while(p2!=null) {
				p2.prev=p2.next;
				p2.next=p1;
				p1=p2;
				p2=p2.prev;
			}
			start    =p1;
		
		
		
		
	}
		public void createList() {
			int i,n,data;
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the number of nodes: ");
			n=scan.nextInt();
			if(n==0)
				return;
			System.out.println("enter the first element to be inserted:");
			data=scan.nextInt();
			insertInEmptyList(data);
			for(i=1;i<=n-1;i++) {
				System.out.println("enter the next elemetn to be inserted: ");
				data=scan.nextInt();
				insertAtEnd(data);
			}
			
			
		}
		public void display() {
			Node p;
			if(start==null) {
				System.out.println("list is empty :");
				return;
			}
			p=start;
			System.out.println("list are :\n");
			while(p!=null) {
				System.out.println(p.info + " ");
				p=p.next;
			}
			System.out.println();
			
		}
		public void insertInEmptyList(int data) {
			Node temp=new Node(data);
			start=temp;
		}
}
