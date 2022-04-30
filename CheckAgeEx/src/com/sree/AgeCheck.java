package com.sree;

	import java.util.Scanner;

    import data.CheckAge;

	class CheckAge extends Exception {

		public void AgeCheck (String s) {
			super(s);//calls super class constructor
		}
	}

	public class AgeCheck {

		public static void main(String[] args) {
			
			int age;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter age");
			age=sc.nextInt();
			try {
			if(age<18) {
				//throw new CheckAge("Not elgible for voting");
				CheckAge ob=new CheckAge("Not elgible for voting");
				throw ob;
			}
			else {
				System.out.println("You can Vote");
			}
			}
			catch(CheckAge e) {
				System.out.println("Object "+e);
				e. printStackTrace();
			}
		}
			}
	class parent{
		private String s;
		parent(String s){
			this.s=s;
		}
}
