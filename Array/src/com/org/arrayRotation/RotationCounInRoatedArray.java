/*
 * Given an array arr[] of size N having distinct numbers sorted
 *  in increasing order and 
 *  the array has been right rotated 
 *  (i.e, the last element will be cyclically
 *   shifted to the starting position of the array)
 *   k number of times, the task is to find the value of k.

Examples:  

Input: arr[] = {15, 18, 2, 3, 6, 12}
Output: 2
Explanation: Initial array must be {2, 3, 6, 12, 15, 18}. 
We get the given array after rotating the initial array twice.

Input: arr[] = {7, 9, 11, 12, 5}
Output: 4
 * 
 * 
 */





package com.org.arrayRotation;


public class RotationCounInRoatedArray {
	public static int rotationCount(int a[]) {
		int n=a.length;
		int min=a[0],minIndx=0;
		
		for(int i=0;i<n;i++) {
			if(min>a[i]) {
				min=a[i];
				minIndx=i;
			}
		}
		return minIndx;
		
	}

	public static void main(String[] args) {
		int a[]= {7, 9, 11, 12, 5};
		 int idx=rotationCount(a);
		 System.out.println(idx);

	}

}
