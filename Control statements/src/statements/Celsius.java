package statements;

import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.for fahrenheit to celsius");
		System.out.println("2.for celsius to fahrenheit");
		System.out.println("Enter your choice");
		 int choice =sc.nextInt();
		 float ft,ct;
		switch (choice) {
		case 1:
			System.out.println("Enter temperature in fahrenheit ");
			ft=sc.nextFloat();
			ct=(ft-32)*5/9.0f;
			System.out.println("tempurature in celsius:" + ct);
			break;
		case 2:
			System.out.println("Enter temperature in celsius ");
			ct=sc.nextFloat();
			ft=9.0f/5.0f*ct+32;
			System.out.println("tempurature in fahrenheit:" + ft);
			break;
			default:
				System.out.println("incorrect choice");
				break;	
		
		}

	}
	}
