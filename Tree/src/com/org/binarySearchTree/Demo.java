package com.org.binarySearchTree;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("recursive methods");
		BinarySearchTree bst = new BinarySearchTree();
		Scanner scan = new Scanner(System.in);

		int ch, x;
		while (true) {
			System.out.println("1.display tree  :");
			System.out.println("2.search ");
			System.out.println("3.insert a new node : ");
			System.out.println("4.delete a node :");
			System.out.println("5.preorder traversal :");
			System.out.println("6.inorder traaversal :");
			System.out.println("7.postorder traversal :");
			System.out.println("8.height of tree :");
			System.out.println("9.find minimum key : ");
			System.out.println("10.find maximum key :");
			System.out.println("11.quite :");
			System.out.println("enter your choice :");
			ch = scan.nextInt();
			if (ch == 11)
				break;
			switch (ch) {
			case 1: {

				break;
			}
			case 2: {

				break;
			}
			case 3: {

				break;
			}
			case 4: {

				break;
			}
			case 5: {

				break;
			}
			case 6: {

				break;
			}
			case 7: {

				break;
			}
			case 8: {

				break;
			}
			case 9: {

				break;
			}
			case 10: {

				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}

		}

	}

}
