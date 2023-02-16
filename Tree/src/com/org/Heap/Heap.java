package com.org.Heap;

import java.util.NoSuchElementException;

public class Heap {
	private int [] a;
	private int n;
	public Heap() {
		a=new int[10];
		n=0;
		a[0]=99999;
	}
	public Heap(int maxSize) {
		a=new int[maxSize];
		n=0;
		a[0]=99999;
	}
	public void insert(int val) {
		n++;
		a[n]=val;
		restoreUp(n);
	}
	private void restoreUp(int i) {
		int k=a[i];
		int parent=i/2;
		while(a[parent]<k) {
			a[i]=a[parent];
			i=parent;
			parent=i/2;
		}
		a[i]=k;
		
	}
	public int deleteRoot() {
		if(n==0)
		{
			throw new NoSuchElementException("heap iss empty ");
		}
		int maxVal=a[1];
		a[1]=a[n];
		n--;
		restoreDown(1);
		return maxVal;
		
	}
	private void restoreDown(int i) {
		int k=a[i];//root element will be store in k .
		int lchild=2*i;//lchild=2*1=2.
		int rchild=2*i+1; //rchild=2*1+1=3
		while(rchild<=n) {
			if(k>=a[lchild] && k>=a[rchild]) {
				a[i]=k;
				return;
			}
			else if(a[lchild]>a[rchild]) {
				a[i]=a[lchild];
				i=lchild;
			}
			else {
				a[i]=a[rchild];
				i=rchild;
			}
			lchild=2*i;
			rchild=2*i+1;
		}
		//if number of nodes is even
		if(lchild==n && k<a[lchild]) {
			a[i]=a[lchild];
			i=lchild;
		}
		a[i]=k;
		
	}
	public void dispay() {
		if(n==0) {
			System.out.println("heap is empty");
		
			
		}
		int i;
		for(i=1;i<a.length;i++) {
			System.out.println(a[i] +" ");
		}
		System.out.println();
	}

}
