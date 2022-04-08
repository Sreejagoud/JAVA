package statements;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=1;
		//do {
		  // System.out.println("hello "+i);
		//i++;
		//}
		//while(i<=3);
		//System.out.println("the valu of i= "+i);
		Scanner sc=new Scanner(System.in);
		int n;
		do {
			System.out.println("enter some value between 1 to 10");
			 n =sc.nextInt();
		}
			while(n<1||n>10);
		System.out.println(n+" is between 1 to 10");
		}
		  }