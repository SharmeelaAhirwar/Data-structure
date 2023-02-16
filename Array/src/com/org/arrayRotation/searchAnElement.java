
/*
 * Given a sorted and rotated array arr[] 
 * of size N and a key, the task is to find the key in the array.

Note: Find the element in O(logN) time 
and assume that all the elements are distinct.
 * Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}, key = 3
Output : Found at index 8
 */



package com.org.arrayRotation;

import java.util.Scanner;

public class searchAnElement {
	public static int search(int[] a, int n) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==n)
				return i;
		}
		
		return -1;
	}
	public static int search1(int[] a, int searchElement) {
		 int n=a.length;
		int first=0,last=n-1,mid;
		while(first<=last) {
			mid=(first+last)/2;
			if(a[mid]==searchElement)
				return mid;
			if(a[first]<=a[mid]) { //left array is sorted
				if(searchElement>=a[first] && searchElement<a[mid])
					last=mid-1;
				else
					first=mid+1;
				
			}
			else { //right array is sorted
				if(searchElement>a[mid] && searchElement<=last)
					first=mid+1;
				else
					last=mid-1;
			}
			
			
		}
		return -1;
	}


	public static void main(String[] args) {
		
		
		int a[]= {5,6,7,8,9,10,1,2,3};
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a element which you want to search in array :");
		n=scan.nextInt();
		int idx=search1(a,n);
		if(idx==-1)
			System.out.println("not found ");
		else
			System.out.println("element found at index "+idx);
	}

	

}
