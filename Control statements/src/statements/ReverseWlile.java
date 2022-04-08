package statements;

import java.util.Scanner;

public class ReverseWlile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num, digit, rev=0;
		System.out.println("Enter a number");
        num = sc.nextInt();
        while(num!=0) {
        	digit=num%10;
        	rev=rev*10+digit;
        	num=num/10;
        	
        }
        System.out.println("Reverse number is "+rev);
	}

}
