import java.util.Scanner;

public class Factorial {
	private Factorial() {
		
	}
	public static long factorial(int n) {
		if(n==0)
			return 1;
		return  n*factorial(n-1);
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n;
		long fact;
		System.out.println("enter a number to find factorail : ");
		n=scan.nextInt();
		fact=factorial(n);
		System.out.println("factoral of " +n+ " "+"is"+" "+fact);
		
		
		// TODO Auto-generated method stub

	}

}
