package com.org.BubbleSort;

import java.util.Scanner;

public class BubbleSort {
	public static void bubbleSort(int a[],int n) {
		int i,j,temp;
		
		for(i=n-2;i>=0;i--) {
			for(j=0;j<=i;j++) {
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int i,n;
		int [] a=new int[20];
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of element do you want to store: ");
		n=scan.nextInt();
		for(i=0;i<n;i++) {
			System.out.println("enter the element "+(i+1) + " : ");
			a[i]=scan.nextInt();
		}
		bubbleSort(a, n);
		System.out.println("sorted array is : ");
		for(i=0;i<n;i++) {
			System.out.println(a[i] +" ");
		}
		System.out.println();
		scan.close();
		

	}

}
