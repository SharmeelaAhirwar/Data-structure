package com.org.binarySearchTree;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("iterative methods");
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
				bst.display();

				break;
			}
			case 2: {
				System.out.println("enter the keey to be searched :");
				x=scan.nextInt();
				if(bst.search1(x))
					System.out.println("key found ");
				else 
					System.out.println("not found ");

				break;
			}
			case 3: {
				System.out.println("enter the key to be inserted : ");
				x=scan.nextInt();
				bst.search1(x);

				break;
			}
			case 4: {
				System.out.println("enter the key to be deleted : ");
				x=scan.nextInt();
				bst.delete1(x);

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
				System.out.println("minimum key is : "+bst.min1());

				break;
			}
			case 10: {
				System.out.println("maximum key is : "+bst.max1());

				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}//end of switch

		}//end of while
		scan.close();

	}
		// TODO Auto-generated method stub

	

}
