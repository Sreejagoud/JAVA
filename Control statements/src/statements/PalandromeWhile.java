package statements;

import java.util.Scanner;

public class PalandromeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int num, digit, rev=0;
        System.out.println("Enter a number");
        num = sc.nextInt();
        System.out.println("before while num="+num);
        int num1=num;
        while(num!=0) {
     	   digit=num%10;  
     	   rev = rev*10+digit;//3,    3*10+2=32   32*10+1=321
     	   num=num/10;  
        }
       System.out.println("Reversed Number is "+rev);
               
       if(rev==num1) {
     	  System.out.println("Palandrome");
       }else {
     	  System.out.println("Not palandrome");
       }
	}

	}
