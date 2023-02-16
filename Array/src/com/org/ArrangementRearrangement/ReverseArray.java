/*
 * 
 * Given an array (or string),
 *  the task is to reverse the array/string.
Examples : 
Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}
 */



package com.org.ArrangementRearrangement;

public class ReverseArray {
	public static void reverse(int a[],int n) {
		int start=0;
		int end=n-1;
		while(start<=end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
			
		}
	}

	public static void main(String[] args) {
		int a[]={1, 2, 3,6,7,8};
		int n=a.length;
		reverse(a,n);
		System.out.println("reversed array :");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
