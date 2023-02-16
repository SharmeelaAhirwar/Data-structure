package com.org.Dequeue;

import java.util.Scanner;

import com.org.queueCircularLL.QueueCLL;

public class Main {

	public static void main(String[] args) {
		int choice, data;
		Scanner scan = new Scanner(System.in);
		DequeueA dequeueA=new DequeueA();
		while (true) {
			System.out.println("1.insert an elemnt from front ");
			System.out.println("2.insert an elemnt from rear");
			System.out.println("3.delete an ele. from front.");
			System.out.println("4.delete an ele. from rear.");
			System.out.println("5.Display all the queuue");
			System.out.println("6.quit");
			choice = scan.nextInt();
			if (choice == 6)
				break;
			switch (choice) {
			case 1: {
				System.out.println("enter an element to be insserted :");
				data=scan.nextInt();
				dequeueA.insertFront(data);
				break;

			}
			case 2:{
				System.out.println("enter an element to be insserted :");
				data=scan.nextInt();
				dequeueA.insertRear(data);
				break;

			}
			case 3: {
				int x=dequeueA.deleteFromFont();
				System.out.println("deleted ele from front is : "+x);
				break;

			}
			case 4: {
				int x=dequeueA.deletefromRear();
				System.out.println("deleted ele from rear is : "+x);
				break;

			}
			case 5: {
				dequeueA.display();
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




