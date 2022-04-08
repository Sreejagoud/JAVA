package statements;

import java.util.Scanner;

public class FindSumindividualDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num,sum=0;
		System.out.println("Enter the number");
		num=sc.nextInt();
		while(num!=0)
		{
			num=num%10;
			sum=sum+num;
			num=num/10;
		}
           System.out.println("sum of digits of given number is"+sum);
	}

}
