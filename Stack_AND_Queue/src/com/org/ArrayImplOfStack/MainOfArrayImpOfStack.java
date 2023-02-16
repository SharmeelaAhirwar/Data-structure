package com.org.ArrayImplOfStack;

import java.util.Scanner;

public class MainOfArrayImpOfStack {

	public static void main(String[] args) {
		int choice, data;
		Scanner scan = new Scanner(System.in);
		ArrayImplOfStack stackA = new ArrayImplOfStack(10);
		while (true) {
			System.out.println("1.push an element on the stack");
			System.out.println("2.pop an element from the stack");
			System.out.println("3.display the top element ");
			System.out.println("4.display all element");
			System.out.println("5.display size of stack");
			System.out.println("6.quit");
			choice = scan.nextInt();
			if (choice == 6)
				break;
			switch (choice) {
			case 1: {
				
				
				
					System.out.println("enter an element to be inserted :");
					data=scan.nextInt();
					stackA.push(data);
					break;
					
				}
				
				
				

			
			case 2: {
				int popElement=stackA.pop();
				System.out.println("pop element is "+popElement);
				break;
				

			}
			case 3: {
				int topElement=stackA.peek();
				System.out.println("top element of stack is " +topElement);
				break;

			}
			case 4: {
				System.out.println("stack are :-");
				stackA.display();
				break;

			}
			case 5: {
				System.out.println("size of stack is "+stackA.sizeOfStack());
				break;

			}
			default:
				System.out.println("wrong choice ");
			}
			System.out.println();
		}
		scan.close();
	}

}
