
/*
 * Given an array of integers arr[] of size N and an integer, 
 * the task is to rotate the array elements to the left by d positions.
 * Input:
 *  
 arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
Output: 3 4 5 6 7 1 2
 */

package com.org.arrayRotation;

public class RotationOfArray {
	public static void rotateArrayMethod1(int[] a, int d, int n) {
		int temp[]=new int[n];
		int  i,k=0;
		for(i=d;i<n;i++) {
			temp[k]=a[i];
			k++;
		}
		for(i=0;i<d;i++) {
			temp[k]=a[i];
			k++;
		}
		for(i=0;i<n;i++) {
			a[i]=temp[i];
		}
		
	}
	public static void rotateArrayMethod2(int [] a,int d,int n) {
		int p=1;
		while(p<=d) {
			int last=a[0];
			for(int i=0;i<n-1;i++) {
				a[i]=a[i+1];
			}
			a[n-1]=last;
			p++;
		}
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int n=a.length;
		int d=2;
		
		rotateArrayMethod1(a,d,n);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		

	}

	

}
