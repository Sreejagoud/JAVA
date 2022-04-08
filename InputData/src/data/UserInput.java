package data;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		float sal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		
		System.out.println("Enter name");
		sc.nextLine();
		
		name=sc.next();
		System.out.println("Enter sal");
		sal=sc.nextFloat();
		//Display
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Sal="+sal);
		sc.close();
	}

}
