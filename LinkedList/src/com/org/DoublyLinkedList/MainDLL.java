package com.org.DoublyLinkedList;

import java.util.Scanner;



public class MainDLL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice, data, k, x;
		Scanner scan = new Scanner(System.in);
		DoublyLinkedList DLinkedList = new DoublyLinkedList();
		DLinkedList.createList();
		while (true) {
			System.out.println("1,Display the list");
			System.out.println("2,insert node in begining");
			System.out.println("3,insert at the end");
			System.out.println("4,insert a before a nodee");
			System.out.println("5,insert after a node");
			System.out.println("6,reverse a list");
			System.out.println("7, delete first Node");
			System.out.println("8,delete last node");
			
			System.out.println("enter you choice");
			choice = scan.nextInt();
			if (choice == 0)
				break;
			switch (choice) {
			case 1: {
				
				DLinkedList.display();
				break;

				
			}
			case 2: {
				System.out.println("insert an element : ");
				data=scan.nextInt();
				DLinkedList.insertAtBegining(data);
				break;

				
			}
			case 3: {
				System.out.println("insert an element : ");
				data=scan.nextInt();
				DLinkedList.insertAtEnd(data);
				break;

				
			}
			case 4: {
				System.out.println("enter a data to be inserted");
				data=scan.nextInt();
				System.out.println("enter a data :");
				x=scan.nextInt();
				
				DLinkedList.insertBeforeANode(data, x);
				break;

				
			}
			case 5: {
				System.out.println("enter a data to be inserted");
				data=scan.nextInt();
				System.out.println("enter a element:");
				x=scan.nextInt();
				DLinkedList.insertAfterANode(data,x);
				break;

				
			}
			case 6: {
				DLinkedList.reverseLIst();
				break;

				
			}
			
			case 7 :{
				DLinkedList.deleteFirstNode();;
				break;
			}
			case 8 :{
				DLinkedList.deleteLastNode();;
				break;
			}
			default:
				System.out.println("wrong choice");
			}//end of switch
			System.out.println();
		}//end of while
		scan.close();
		System.out.println("existing");
	}

}

