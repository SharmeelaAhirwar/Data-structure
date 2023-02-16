package com.org.binarySearchTree;

public class BinarySearchTree {
	private Node root;
	public BinarySearchTree() {
	        root=null;
	}
	
	public boolean isEmpty() {
		return(root==null);
	}
	public void insert(int k) {
		root=insert(root,k);
		
	}
//	 recursive method 
	private Node insert(Node p ,int k) {
		if(p==null)
			p=new Node(k);
		else if(k<p.info)
			p.leftChild=insert(p.leftChild,k);
		else if(k>p.info)
			p.rightChild=insert(p.rightChild, k);
		else
			System.out.println(k +"is already prasent  in tree : ");
		return p;
		
	}
	//iterative method 
	public void insert1(int x) {
		Node p=root;
		Node par=null;
		while(p!=null) {
			par=p;
			if(x<p.info)
				p=p.leftChild;
			else if(x>p.info)
				p=p.rightChild;
			else
			{
				System.out.println(x+"is already prasent in tree");
				return;
			}
		}
			Node temp=new Node(x);
			if(par==null)
				root=temp;
			else if(x<par.info)
				par.leftChild=temp;
			else
				par.rightChild=temp;
		}
	public boolean search(int x) {
		return (search(root,x)!=null);
	}
//	recursive method
	private Node search(Node p,int x) {
		if(p==null)
			return null;  //key not to be found
		if(x<p.info)
			return search(p.leftChild,x);
		if(x>p.info)
			return search(p.rightChild,x);
		return p;
		
	}
	//iterative method
	public boolean search1(int k) {
		Node p=root;
		while(p!=null) {
			if(k<p.info)
				p=p.leftChild;
			else if(k>p.info)
				p=p.rightChild;
			else
				return true;
		}
		return false;
	}
	//iterative method
	public int min1() {
		if(isEmpty())
			throw new NullPointerException("tree is empty");
		Node p=root;
		while(p.leftChild!=null) {
			p=p.leftChild;
		}
		return p.info;
	}
	//iterative method
	public int max1() {
		if(isEmpty())
			throw new NullPointerException("tree is  empty");
		Node p=root;
		while(p!=null) {
			p=p.rightChild;
		}
		return p.info;
	}
	//recursion
	public int min() {
		if(isEmpty())
			throw new NullPointerException("tree is empty");
		return min(root).info;
	}
	private Node min(Node p) {
		if(p.leftChild==null)
			return p;
		return min(p.leftChild);
	}
	//recursion
	public int max() {
		if(isEmpty())
			throw new NullPointerException("tree is empty");
		return max(root).info;
		
	}
	private Node max(Node p) {
		if(p.rightChild==null)
			return p;
		return max(p.rightChild);
	}
	public void delete1(int x) {
		Node p=root;
		Node par=null;
		while(p!=null) {
			if(x==p.info)
				break;
			par=p;
			if(x<p.info)
				p=p.leftChild;
			else
				p=p.rightChild;
		}
		if(p==null) {
			System.out.println(x+"not found : ");
			return;
		}
		//case c: 2childresn
		//find inorder successor and its parent
		Node s,ps;
		
		if(p.leftChild!=null && p.rightChild!=null) {
			ps=p;
			s=p.rightChild;
			while(s.leftChild!=null) {
				ps=s;
				s=s.leftChild;
			}
			p.info=s.info;
			p=s;
			par=ps;
		}
		//case B and case A :1 or no child
		Node ch;
		if(p.leftChild!=null)//node to be deleted has leftchild
			ch=p.leftChild;
		else
			ch=p.rightChild;  //node to be deleted has rightchild or no
		if(par==null)  //node to be deleted is root node
			root=ch;
		else if(p==par.leftChild) //node is left child of its parent
			par.leftChild=ch;
		else
			par.rightChild=ch;//node is left child of its parent
	}
	public void display() {
		
	}
	public void delete(int x) {
		root=delete(root,x);
	}
	private Node delete(Node p,int x) {
		Node ch,s;
		if(p==null) {
			System.out.println("not found");
			return p;
			
		}
		if(x<p.info)
			p.leftChild=delete(p.leftChild,x);
		else if(x>p.info)
			p.rightChild=delete(p.rightChild,x);
		else {
			//key to be deleted found
			if(p.leftChild!=null && p.rightChild!=null) //2 child
			{
				s=p.rightChild;
				while(s.leftChild!=null) {
					s=s.leftChild;
				}
				p.info=s.info;
				p.rightChild=delete(p.rightChild,s.info);
			}
			else //1 child or no child
			{
				if(p.leftChild!=null)//only left child
					ch=p.leftChild;
				else     //only right child or nonchild
					ch=p.rightChild;
				p=ch;
			}
		}
		return p;
		
			
		
	}

}
