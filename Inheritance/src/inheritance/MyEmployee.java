package inheritance;

import java.util.Scanner;

		class  Employee{
			String name;
			int age;

			void input() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter name");
				name=sc.next();
				System.out.println("Enter age");
				age=sc.nextInt();
			}
			
			void display() {
				System.out.println("Name="+name);
				System.out.println("Age="+age);
				System.out.println("Salary="+salary);
			}
		float salary;
		   void Employee1(){
			   salary=40000;
		   }
		}
		class  Employee2{
			String name;
			int age;
			
			void input() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter name");
				name=sc.next();
				System.out.println("Enter age");
				age=sc.nextInt();
				System.out.println("Enter salary");
				salary=sc.nextLine();
			}
			void display() {
				System.out.println("Name="+name);
				System.out.println("Age="+age);
				System.out.println("Salary="+salary);
				public class MyEmployee {
					public static void main(String[] args) {
						Employee ob=new Employee();
						
					   ob.input();
						ob.display();
					
					}
				}
	}
		}
