package com.org.expressionValidationStack;

class StackA{
	   private static char[] stackArray;
		private static int top;
		
		public StackA() {
			stackArray=new char[30];
			top=-1;
		}
		public StackA(int maxSize) {
			stackArray=new char[maxSize];
			top=-1;
		}
		public  static boolean isEmpty() {
			return(top==-1);
		}
		public  static boolean isFull() {
			return(top==stackArray.length-1);
		}
		public  static void push(char exp) {
			if(isFull()) {
				System.out.println("stack overFlow");
			}
			else {
				top=top+1;
				stackArray[top]=exp;
			}
		}
		public static char pop() {
			if(isEmpty()) {
				System.out.println("stack underflow");
			}
			char ch=stackArray[top];
			top=top-1;
			return ch;
		}
	}
		
	


