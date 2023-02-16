package com.org.binaryTreeSort;



public class BinarySearchTree {
	private Node root;
	private static int x;
	
	
	public BinarySearchTree() {
		root=null;
	}
	public boolean isEmpty() {
		return(root==null);
	}
	public void inorder(int a[]) {
		x=0;
		inorder(root,a);
		
	}
	private void inorder(Node p,int a[]) {
		if(p==null)
			return;
		inorder(p.left,a);
		a[x++]=p.info;
		inorder(p.right,a);
	}
	public void insert(int k) {
		root=insert(root,k);
		
	}
//	 recursive method 
	private Node insert(Node p ,int k) {
		if(p==null)
			p=new Node(k);
		else if(k<p.info)
			p.left=insert(p.left,k);
		else if(k>p.info)
			p.right=insert(p.right, k);
		else
			System.out.println(k +"is already prasent  in tree : ");
		return p;
		
	}

}
