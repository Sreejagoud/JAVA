package exception;

import java.util.Scanner;

public class DivisinError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		System.out.println("Before division");
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("catch block excute only when exception occured");
		}
		finally {
			System.out.println("finally block excutes always");
		}
		System.out.println("after division");
		System.out.println("program other statements");
	}

}
