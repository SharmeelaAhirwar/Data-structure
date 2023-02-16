package com.org.binaryTreeSort;

import java.util.Scanner;

public class BinaryTreeSort {
	
public static void sort(int a[],int n) {
	BinarySearchTree bt=new BinarySearchTree();
	for(int i=0;i<n;i++) {
		bt.insert(a[i]);
		bt.inorder(a);
	}
}
	public static void main(String[] args) {
		int i,n;
		int [] a= new int[20];
		
		int [] temp=new int[20];
		Scanner scan=new Scanner(System.in);
		System.out.println("enter how many elements you want tostore :");
		n=scan.nextInt();
		for(i=0;i<n;i++) {
			System.out.println("enter elements "+(i+1)+" ");
			a[i]=scan.nextInt();
		}
		
		
		sort(a, n);
		
		
		
		
		System.out.println("sorted array is : ");
		for(i=0;i<n;i++) {
			System.out.println(a[i] +" ");
		}
		System.out.println();
		scan.close();


	}

}
