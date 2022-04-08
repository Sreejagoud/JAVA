package statements;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int sum=0,num,digit,num1;
       System.out.println("Enter a number");
       num = sc.nextInt();
       num1=num;
       while(num!=0) {
     	   digit=num%10;
     	   sum=sum+digit*digit*digit;
     	      	   num=num/10;  
        }
                  
       if(sum == num1) {
     	  System.out.println("print Aramstong number ");
       }else {
     	  System.out.println("Not a armstrong number");
       }
	}
}