package P2;

import java.util.Scanner;

public class ParentP2 {
	class Parent{
		private int sal; //data accessed with in class , scope is with in class
		public String name;
		//with in package and outside package all the classes can access
		protected int age; //extended class can access without object ref
		                   //within package other classes can access with ref to object
		                   //another package only extended class can access
		int accno;//default scope with in package all the classes  can access (public)
		           //another package default becomes private
	 void input() {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter age");
			age=sc.nextInt();
			System.out.println("Enter salary");
			sal=sc.nextInt();
			System.out.println("Enter Accno");
			accno=sc.nextInt();
			System.out.println("Enter name");
			name=sc.next();
		}
		void printSal() {
			System.out.println("Salary="+sal);
		}
	}

}
