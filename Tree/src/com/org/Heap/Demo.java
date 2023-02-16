package com.org.Heap;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Heap hp=new Heap(20);
		int choice,val;
		while(true) {
			System.out.println("1.insert :");
			System.out.println("2.delete root :");
			System.out.println("3.display heap : ");
			System.out.println("4.exit :");
			System.out.println("please select your choice : ");
			choice=scan.nextInt();
			if(choice==4)
				break;
			switch (choice) {
			case 1: {
				System.out.println("please enter an element which you want to insert :");
				val=scan.nextInt();
				hp.insert(val);
				break;
				
			}
			case 2:{
				System.out.println("deleted value is : "+hp.deleteRoot());
				break;
				
			}
			case 3:{
				System.out.println("heap is  :  ");
				hp.dispay();
				break;
				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " +choice);
			}
		}
	}

}
