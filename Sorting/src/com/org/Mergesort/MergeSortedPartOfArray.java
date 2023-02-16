package com.org.Mergesort;

import java.util.Scanner;

public class MergeSortedPartOfArray {
	public static void merge(int a[],int temp[],int low1,int up1,int low2,int up2) {
		 int i=low1;
		 int j=low2;
		 int k=low1;
		 while((i<=up1) && (j<=up2)) {
			 if(a[i]<=a[j])
				 temp[k++]=a[i++];
			 else
				 temp[k++]=a[j++];
				 
		 }
		 while(i<=up1)
			 temp[k++]=a[i++];
		 
		 
		 while(j<=up2)
			 temp[k++]=a[j++];
		
		
	}

	public static void main(String[] args) {
		int i;
		int [] a= {1,3,5,7, 2,4,6,9,11,14};
		
		int [] temp=new int[20];
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Array is  : ");
		for(i=0;i<=9;i++) {
			System.out.println(a[i] +" ");
		}
		
		merge(a, temp, 0, 3,4,9);
		
		System.out.println("sorted array is : ");
		for(i=0;i<=9;i++) {
			System.out.println(temp[i] +" ");
		}
		System.out.println();
		scan.close();

	}

}
