package com.org.binaryTree;

public class Demo {

	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		bt.createTree();
		bt.display();
		System.out.println();
		System.out.println("preorder");
		bt.preorder();
		System.out.println();
		System.out.println("inorder : ");
		bt.inorder();
		System.out.println(" ");
		
		System.out.println("postorder : ");
		bt.postorder();
		System.out.println(" ");
		System.out.println("height of Binary tree " + bt.height());
		
		System.out.println("");
		System.out.println("levelOrder Traversal : ");
		bt.levelOrser();
		
		// TODO Auto-generated method stub

	}

}
