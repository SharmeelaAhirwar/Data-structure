/*
 * input=a[]={1,2,3}
 * output={3,2,1}
 */


package com.org.ArrayQueastions;

class ReverseArray{
	
	public static void reverseArray(int a[],int n) {
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
		int a[]= {1,2,3};
		int n=a.length;
		reverseArray(a, n);
		System.out.println("reverse array :");
		for(int i=0;i<n;i++) {
			System.out.print(a[i] +" ");
		}
		
	}
}