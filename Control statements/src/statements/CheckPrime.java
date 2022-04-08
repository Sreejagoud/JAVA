package statements;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,c=0;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check");
		num = sc.nextInt();
		
		for(i=1;i<=num;i++) { //5
			if(num%i==0) {
				c=c+1;
			}
		}
		if(c==2) {
			System.out.println(num+ " is prime number");
		}
		else {
			System.out.println(num+ " is not prime number");
}
		System.out.println("Do u want to continue N/Y");
		ch=sc.next().charAt(0);
		while(ch!='N'); 

	}

}
