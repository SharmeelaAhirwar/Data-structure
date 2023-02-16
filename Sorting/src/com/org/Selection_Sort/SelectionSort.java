package com.org.Selection_Sort;

import java.util.Scanner;

public class SelectionSort {
	
	
	public static void sortSelection(int a[],int n) {
		int i,j,minIndex,temp;
		for(i=0;i<n-1;i++) {
			minIndex=i;
			for(j=i+1;j<n;j++) {
				if(a[j]<a[minIndex])
					minIndex=j;
			}
			if(i!=minIndex) {
				temp=a[i];
				a[i]=a[minIndex];
				a[minIndex]=temp;
				
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
		sortSelection(a, n);
		System.out.println("sorted array is : ");
		for(i=0;i<n;i++) {
			System.out.println(a[i] +" ");
		}
		System.out.println();
		scan.close();
	}

}
