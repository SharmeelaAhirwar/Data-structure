package com.org.expressionValidationStack;

import java.util.Scanner;

public class Demo {
	
	
	public  static boolean isValid(String exp) {
		 StackA st=new StackA();
			char ch;
			
		for(int i=0;i<exp.length();i++) {
			if(exp.charAt(i)=='(' || exp.charAt(i)=='{' || exp.charAt(i)=='[') 
				st.push(exp.charAt(i));
			
			if(exp.charAt(i)==')' || exp.charAt(i)=='}' || exp.charAt(i)==']') {
				if(st.isEmpty()) {
					System.out.println("right parenthesis are more than left parenthesis");
				     return false;
				}
				else {
					ch=st.pop();
					if(!matchParenthesis(ch,exp.charAt(i))) {
						System.out.println("missMatched parenthesis  are : ");
						System.out.println(ch + " and "+exp.charAt(i));
						return false;
					}
				}
			}
		}
			if(st.isEmpty()) {
				System.out.println("balanced parenthesisi");
				return true;
			}
			else {
				System.out.println("left parenthesis are  more than right parenthesis");
			    return false;
			}
				
		}
	public static boolean matchParenthesis(char leftPar,char rightPar) {
		if(leftPar=='[' && rightPar==']')
			return true;
		if(leftPar=='{' && rightPar=='}')
			return true;
		if(leftPar=='(' && rightPar==')')
			return true;
		
		return false;
	}
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter an exp with parenthesis : ");
		exp=scan.nextLine();
		if(isValid(exp)) {
			System.out.println("valid expression");
		}
		else {
			System.out.println("invalid expression");
		}
		scan.close();

	}
	 



}
