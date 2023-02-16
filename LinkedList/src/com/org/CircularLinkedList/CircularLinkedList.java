package com.org.CircularLinkedList;

import java.util.Scanner;

public class CircularLinkedList {
	private Node last;

	public CircularLinkedList() {
		last = null;
	}

	public void display() {
		Node p;
		if (last == null) {
			System.out.println("llist is empty");
			return;
		}
		p = last.link;
		do {
			System.out.println(p.info + " ");
			p = p.link;
		} while (p != last.link);
		System.out.println();

	}

	public void insertInBegining(int data) {
		Node temp = new Node(data);
		temp.link = last.link;
		last.link = temp;

	}

	public void insertInEmptyList(int data) {
		Node temp = new Node(data);
		last = temp;
		last.link = last;
	}

	public void insertAtEnd(int data) {
		Node temp = new Node(data);
		temp.link = last.link;
		last.link = temp;
		last = temp;
	}

	public void createList() {
		int i, n, data;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no of nodes:");
		n = scan.nextInt();
		if (n == 0) {
			return;
		}
		System.out.println("enter the elements to be inserted :");
		data = scan.nextInt();
		insertInEmptyList(data);
		for (i = 2; i <= n; i++) {
			System.out.println("enter the elements to be inserted :");
			data = scan.nextInt();
			insertAtEnd(data);
		}
	}

	public void insertAfterANode(int data, int x) {
		Node p = last.link;
		do {
			if (p.info == x)
				break;
			p = p.link;
		} while (p != last.link);
		if (p == last.link && p.info != x)
			System.out.println(x + "is not prasent in the list ");
		else {
			Node temp = new Node(data);
			temp.link = p.link;
			p.link = temp;
			if (p == last)
				last = temp;
		}
	}

	public void insertBeforeANode(int data, int x) {

	}

	public void deletefirstNode() {
		if (last == null)
			return;
		if (last.link == last) {
			last = null;
			return;
		}
		last.link = last.link.link;
	}

	public void deleteLastNode() {
		if (last == null)
			return;
		if (last.link == last) {
			last = null;
			return;
		}
		Node p = last.link;
		while (p.link != last)
			p = p.link;
		p.link = last.link;
		last = p;
	}
	public void deleteNode(int x) {
		if(last==null)
			return;
		if(last.link==last && last.info==x) {
			last=null;
			return;
		}
		if(last.link.info==x) {
			last.link=last.link.link;
			return;
		}
		Node p=last.link;
		while(p.link!=last.link) {
			if(p.link.info==x)
				break;
			p=p.link;
		}
		if(p.link==last.link)
			System.out.println("x not found");
		else {
			p.link=p.link.link;
			if(last.info==x)
				last=p;
		}
	}

}
