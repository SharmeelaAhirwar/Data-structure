package com.org.Heap;

public class Demo1 {

	public static void buildHeap_BottomUp(int[] a, int n) {
		for (int i = 2; i <= n; i++) {
			restoreUp(i, a);
		}

	}

	public static void buildHeap_topDown(int[] a, int n) {
		for (int i = n / 2; i >= 1; i--) {
			restoreDown(i, a);
		}
	}

	public static void restoreDown(int i, int[] a) {
		int n=a.length-1;
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
	public static void restoreUp(int i, int[] a) {
		int k=a[i];
		int parent=i/2;
		while(a[parent]<k) {
			a[i]=a[parent];
			i=parent;
			parent=i/2;
		}
		a[i]=k;

	}

	public static void main(String[] args) {
		int a1[]= {99999,1,4,5,7,9,10};
		int n1=a1.length-1;
		
		buildHeap_BottomUp(a1,n1);
		
		for(int i=1;i<n1;i++) {
			System.out.println(a1[i] +" ");
		}
		System.out.println();
		
		int a2[]= {99999,1,4,5,7,9,10};
		int n2=a2.length-1;
		
		buildHeap_topDown(a2,n2);
		
		
		for(int i=1;i<n2;i++) {
			System.out.println(a2[i] +" ");
		}
	}

}
