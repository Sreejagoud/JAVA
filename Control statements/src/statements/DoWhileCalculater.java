package statements;

import java.util.Scanner;

public class DoWhileCalculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float amount=50000.0f,deposit,withdraw;
		char ch;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("****//////Enter the choice//////*******");
		System.out.println("1.Deposit amount");
		System.out.println("2.Withdraw amount");
		System.out.println("3.Display the balance amount");
		System.out.println("Enter your choice");
		 int choice =sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Deposit");
			System.out.println("Enter the amount to be deposited");
			deposit=sc.nextFloat();
			if(deposit>0) {
			amount=amount+deposit;
			System.out.println("amount after deposit "+amount);}
			else 
			{
				System.out.println("Deposit amount should not be negative");
			}
			break;
		case 2:
			System.out.println("Withdraw ");
			System.out.println("Enter the amount to be withdraw");
			withdraw=sc.nextFloat();
			if(withdraw<amount) {
			     amount=amount-withdraw;
		    System.out.println("balance amount="+amount);
			}
			else {
				System.out.println("insufficient balance");
			}
				break;	
		case 3:
			System.out.println("your account balance is"+amount);
			break;
			
			default:
			System.out.println("Invalid input");
		}
			System.out.println("Do u want to continue N/Y");
			ch=sc.next().charAt(0);
		}
			while(ch!='N'); 
	}
		
}
