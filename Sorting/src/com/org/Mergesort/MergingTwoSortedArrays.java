package com.org.Mergesort;

import java.util.Scanner;

public class MergingTwoSortedArrays {
	
	public static void mergr(int [] a1,int [] a2,int [] temp,int n1,int n2) {
		 int i=0,j=0,k=0;
		 while((i<n1-1) &&(j<=n2-1)) {
			 if(a1[i]<a2[j])
				 temp[k++]=a1[i++]; //temp[k]=a1[i]   k=k+1,i=i+1
			 else
				 temp[k++]=a2[j++];
		 }
		 while(i<=n1-1) //copy remaining element of a1, a2 finished
			 temp[k++]=a1[i++];
		 
		 
		 while(j<=n2-1) //copy remaining element of a2, a1 finished
			 temp[k++]=a2[j++];
		
		
	}

	public static void main(String[] args) {
		int i,n1,n2;
		int [] a1=new int[20];
		int [] a2=new int[20];
		int [] temp=new int[40];
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of element do you want to store: ");
		n1=scan.nextInt();
		System.out.println("enter the element in sorted order : ");
		for(i=0;i<n1;i++) {
			System.out.println("enter the element "+(i+1) + " : ");
			a1[i]=scan.nextInt();
		}
		
		
		System.out.println("enter the number of element do you want to store: ");
		n2=scan.nextInt();
		System.out.println("enter the element in sorted order : ");
		for(i=0;i<n2;i++) {
			System.out.println("enter the element "+(i+1) + " : ");
			a2[i]=scan.nextInt();
		}
		
		mergr(a1, a2, temp, n1, n2);
		
		System.out.println("sorted array is : ");
		for(i=0;i<n1+n2;i++) {
			System.out.println(temp[i] +" ");
		}
		System.out.println();
		scan.close();
	}

}
