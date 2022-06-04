package example;

import java.util.Scanner;

public class Calculate {
		int f,num,rev;
		
		public Calculate(int n) 
		{
			num=n;
			f=0;
			rev=0;
			
		}
		public int prime() {
			f=1;
			if(num==0||num==1) {
			f=0;	
			}
			else {
				for(int i=2;i<=num/2;i++) {
					if(num%i==0) {
						f=0;
						break;
					}
				}
			}
			return f;
		}
		public int reverse()
		{
			int s=num;
			while(s!=0) {
				int digit=s%10;
				rev=rev*10+digit;
				s=s/10;
			}
			return rev;
		}
		public void display() {
			if(f==1 && rev==num) {
				System.out.println(num+ "is prime and palindrome");
			}
			else {
				System.out.println(num+ "is not a prime and palindrome");
			}
		}
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number");
			int name=sc.nextInt();
			Calculate c=new Calculate(name);
			c.prime();
			c.reverse();
			c.display();
	}

}
