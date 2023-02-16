package com.org.ArrayImplQueue;

import java.util.Scanner;

public class QMainA {
	public static void main(String[] args) {
		int choice, data;
		Scanner scan = new Scanner(System.in);
		QueueA queueA = new QueueA(10);
		while (true) {
			System.out.println("1.insert an elemnt in the queuue");
			System.out.println("2.delete an element from the queuue");
			System.out.println("3.display top element of queue");
			System.out.println("4.display all elemnts of the queuue");
			System.out.println("5.Display sisze of the queuue");
			System.out.println("6.quit");
			choice = scan.nextInt();
			if (choice == 6)
				break;
			switch (choice) {
			case 1: {
				System.out.println("enter an element to be insserted :");
				data=scan.nextInt();
				queueA.insert(data);
				break;

			}
			case 2: {
				 int deletedElement=queueA.delete();
				 System.out.println("deleted  Element is "+deletedElement);
				 break;

			}
			case 3: {
				System.out.println("top element of the queue is "+queueA.peek());
				break;

			}
			case 4: {
				queueA.display();;
				break;

			}
			case 5: {
				System.out.println("size of the queue is "+queueA.size());
				break;

			}
			default:
				System.out.println("wrong choice");
			}
			System.out.println();

		}
		scan.close();

	}

}
