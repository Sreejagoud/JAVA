package statements;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		System.out.println("factors of "+num);
		
           for(i=1; i<=num;i++) {
        	   if(num%i==0) {
        		   System.out.println(i);
        	   }
           }
	}

}
