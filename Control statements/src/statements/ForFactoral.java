package statements;

import java.util.Scanner;

public class ForFactoral {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num,factoral=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		num=sc.nextInt();
		for(i=num;i>=1;i++) {
			factoral=factoral*i;
		}
		System.out.println("factoral of number "+num+" is "+factoral);
	}

}
