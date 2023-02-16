package com.org.Mergesort;

import java.util.Scanner;

public class MergeSortRecursively {
	
	public static void sort(int a[],int n) {
		int [] temp=new int[n];
		sort(a,temp,0,n-1);
	}
	private static void sort(int a[],int temp[],int low,int up) {
		
		if(low==up) //only one element.
			return;
		int mid=(low+up)/2;
		
		sort(a,temp,low,mid);  //sort a[low].......a[mid]
		
		sort(a,temp,mid+1,up);//sort a[mid+1].......a[up]
		
		merge(a,temp,low,mid,mid+1,up);
		copy(a,temp,low,up);
	}
	private static void merge(int a[],int temp[],int low1,int up1,int low2,int up2)
	{
		int i=low1;
		int j=low2;
		int k=low1;
		while((i<=up1) && (j<=up2)) {
			if(a[i]<a[j]) {
				temp[k++]=a[i++];
			}
			else
				temp[k++]=a[j++];
			
		}
		while(i<=up1)
			temp[k++]=a[i++];
		while(j<=up2)
			temp[k++]=a[j++];
	}
	private static void copy(int a[],int temp[],int low ,int up) {
		for(int i=low;i<=up;i++) {
			a[i]=temp[i];
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
