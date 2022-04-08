package statements;

import java.util.Scanner;

public class FactoralWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num,factoral=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		num=sc.nextInt();
		i=num;
		while(i>=1)  {
			factoral=factoral*i;
			i=i-1;
		}
		System.out.println("factoral of number "+num+" is "+factoral);
		
		}

	}


