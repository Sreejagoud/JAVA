package java;

import java.util.Scanner ;

public class EvenOrOdd {

		public static void main(String[] args) {
			int num;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number");
			num=scanner.nextInt();
			//2 4 6 8 ....   2%2=0   4%2=0 
			//1 3 5 7 9....  1%2=1 3%2=1 5%2=1
			if(num==0) {
				System.out.println("Neither even nor odd");
			}
			else if(num%2==0) { //true
				System.out.println(num+" is an Even number");
			}
			else {
				System.out.println(num+" is an odd number");
			}
		}
	}



