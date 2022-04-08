package staticproject;

import java.util.Scanner;
	class Employee{
		int eid;
		String name;
		static String cname="Oracle";
		void accept() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name");
			name=sc.next();
			System.out.println("Enter eid");
			eid=sc.nextInt();
		}
		void display() {
			System.out.println("Name="+name);
			System.out.println("Id="+eid);
			System.out.println("Company Name="+cname);
		}
		
	}

	public class StaticDemo {
	 
		public static void main(String[] args) {
			System.out.println("Main method");
			Employee eob[];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of Employees");
			int n=sc.nextInt();
			eob=new Employee[n];
			for(int i=0;i<n;i++)
			{
			    eob[i]=new Employee();
			    eob[i].accept();
			}
			System.out.println("Employee Details");
			for(int i=0;i<n;i++)
			{
				eob[i].display();
			}
			
			}
	}