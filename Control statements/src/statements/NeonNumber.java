package statements;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int sqaurenum,num,digit,sum=0;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number");
          num=sc.nextInt();
          sqaurenum=num*num;
          while(sqaurenum!=0)
          {
        	  digit =sqaurenum%10;
        	  sum=sum+digit;
        	  sqaurenum=sqaurenum/10;
          }
         if(sum==num) {
        	 System.out.println("Neon number");
        	 
         }else {
        	 System.out.println("not a Neon number");
         }
	}

}
