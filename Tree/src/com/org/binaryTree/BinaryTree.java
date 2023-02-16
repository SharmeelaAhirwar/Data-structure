package com.org.binaryTree;

public class BinaryTree {
	private Node root;
	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root=null;
	}
	public void display() {
		display(root,0);
		System.out.println();
	}
	public void display(Node p,int level) {
		int i;
		if(p==null)
			return;
		display(p.rightChild, level+1);
		System.out.println();
		for(i=0;i<level;i++)
			System.out.println("  ");
		System.out.println(p.info +" ");
		display(p.leftChild,level+1);
	}
	public void preorder() {
		preorder(root);
		System.out.println();
	}
	private void preorder(Node p) {
		if(p==null)
			return;
		System.out.println(p.info +" ");
		preorder(p.leftChild);
		preorder(p.rightChild);
	}
	public void inorder() {
		inorder(root);
		System.out.println();
	}
	private void inorder(Node p) {
		if(p==null)
			return;
		inorder(p.leftChild);
		System.out.println(p.info+" ");
		inorder(p.rightChild);
	}
	public void postorder() {
		postorder(root);
		System.out.println();
	}
	private void postorder(Node p) {
		if(p==null)
			return;
		postorder(p.leftChild);
		postorder(p.rightChild);
		System.out.println(p.info +" ");
	}
	public int height() {
		 return heightOfBT(root);
	
	}
	private int heightOfBT(Node p) {
		int hl,hr;
		if(p==null)
			return 0;
		hl=heightOfBT(p.leftChild);
		hr=heightOfBT(p.rightChild);
		if(hl>hr) {
			return 1+hl;
		}
		else
			 return 1+hr;
		
	}
	public void levelOrser() {
		levelOrderTraversal(root);
	}
	private void levelOrderTraversal(Node p) {
		if(p==null) {
			System.out.println("tree is empty : ");
			return;
		}
		QueueA queue=new QueueA(20);
		queue.insert(p);
		while(!queue.isEmpty()) {
			p=queue.delete();
			System.out.println(p.info +" ");
			if(p.leftChild!=null) {
				queue.insert(p.leftChild);
			}
			if(p.rightChild!=null) {
				queue.insert(p.rightChild);
			}
		}
		System.out.println();
	}
public void createTree() {
	root=new Node('p');
	root.leftChild=new Node('q');
	root.rightChild=new Node('r');
	root.leftChild.leftChild=new Node('a');
	root.leftChild.rightChild=new Node('b');
	root.rightChild.rightChild=new Node('x');
	
}
}
