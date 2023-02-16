/*
 * Given an array, cyclically rotate the array clockwise by one. 

Examples:  

Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}
 */


package com.org.arrayRotation;

import java.util.Scanner;

public class CyclicRotation {
	
	public static void rotateCyclicaly(int[] arr, int n) {
		int x=arr[n-1];
		for(int i=n-1;i>0;i--) {
			arr[i]=arr[i-1];
			
		}
		arr[0]=x;
	}
	public static void rotate2(int arr[],int n) {
		 int i = 0, j = arr.length - 1;
	       while(i != j)
	       {
	         int temp = arr[i];
	         arr[i] = arr[j];
	         arr[j] = temp;
	         i++;
	       }
	}

	public static void main(String[] args) {
		int n;
		int arr[]=new int[20];
		Scanner scan=new Scanner(System.in);
		System.out.println("enter how many elements you want to store :");
		n=scan.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter element "+(i+1)+" ");
			arr[i]=scan.nextInt();
		}
		rotateCyclicaly(arr,n);
		
		System.out.println("using method1:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
			
		}
		
		System.out.println("using method2:");
		rotate2(arr, n);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
			
		}
		

	}

	

}
