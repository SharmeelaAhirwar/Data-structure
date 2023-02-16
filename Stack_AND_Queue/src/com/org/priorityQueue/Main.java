package com.org.priorityQueue;

import java.util.Scanner;

import com.org.Dequeue.DequeueA;

public class Main {

	public static void main(String[] args) {
		int choice, data,pr;
		Scanner scan = new Scanner(System.in);
		PriorityQueue priorityQ=new PriorityQueue();
		while (true) {
			System.out.println("1.insert an elemnt");
			System.out.println("2.delete an ele..");
			System.out.println("3.Display all the queuue");
			System.out.println("4.quit");
			choice = scan.nextInt();
			if (choice == 4)
				break;
			switch (choice) {
			case 1: {
				System.out.println("enter an element to be insserted :");
				data=scan.nextInt();
				System.out.println("enter an  priority of element to be insserted :");
				pr=scan.nextInt();
				priorityQ.insert(data, pr);
				break;

			}
			
			case 2: {
				int x=priorityQ.delete();
				System.out.println("deleted ele from front is : "+x);
				break;

			}
			
			case 3: {
				priorityQ.display();
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





