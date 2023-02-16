package com.org.queueCircularLL;

import java.util.Scanner;

import com.org.SlinkedListIMPlOFQueue.QueueL;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice, data;
		Scanner scan = new Scanner(System.in);
		QueueCLL queueCLL = new QueueCLL();
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
				queueCLL.insert(data);
				break;

			}
			case 2: {
				 int deletedElement=queueCLL.delete();
				 System.out.println("deleted  Element is "+deletedElement);
				 break;

			}
			case 3: {
				System.out.println("top element of the queue is "+queueCLL.peek());
				break;

			}
			case 4: {
				queueCLL.display();;
				break;

			}
			case 5: {
				System.out.println("size of the queue is "+queueCLL.size());
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



