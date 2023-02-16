import java.util.Scanner;

public class SumOfDigitsOfNumber {
	public static long sumOfDigits(long n) {
		if(n/10==0)
			return n;
		return sumOfDigits(n/10)+n%10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		long n;
		System.out.println("enter number : ");
		n=scan.nextLong();
		System.out.println(sumOfDigits(n));
		scan.close();

	}

}
