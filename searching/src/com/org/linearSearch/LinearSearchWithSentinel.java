package com.org.linearSearch;

import java.util.Scanner;

public class LinearSearchWithSentinel {
	public static int search(int[] a, int searchElement, int n) {
		a[n]=searchElement;
		int i=0;
		while(searchElement!=a[i])
			i++;
		if(i<n)
			return i;
		else
			return -1;
		
	}

	public static void main(String[] args) {
		int n,i,searchElement;
		int a[]=new int[20];
		Scanner scan=new Scanner(System.in);
		System.out.println("enter how many elements yo want to store :");
		n=scan.nextInt();
		for(i=0;i<n;i++) {
			System.out.println("enter a element :"+(i+1)+" ");
			a[i]=scan.nextInt();
		}
		System.out.println("enter eleemnts which you want to search :");
		searchElement=scan.nextInt();
		 int indx=search(a,searchElement,n);
		 if(indx==-1) {
			 System.out.println("elemet not found ");
		 }
		 else
			 System.out.println("element found at index " +indx +"");

	}

	

}
