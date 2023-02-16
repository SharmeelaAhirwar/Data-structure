import java.util.Scanner;

public class PrintNoFromNto1 {
	public static void print1(int n) {
		if(n==0)
			return;
		System.out.println(n +" ");
		print1(n-1);
	}
	public static void print2(int n) {
		if(n==0)
			return;
		print2(n-1);
		System.out.println(n+ " ");
	}
	public static void main(String []arge) {
		Scanner scan=new Scanner(System.in);
		int n;
		System.out.println("enter a number: ");
		n=scan.nextInt();
		print1(n);
		System.out.println("output of print2 method");
		print2(n);
	}

}
