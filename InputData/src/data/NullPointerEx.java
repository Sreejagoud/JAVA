package data;

import java.util.Scanner;

public class NullPointerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n=null;
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter name");
		n=sc.nextLine();
		System.out.println("Name="+n);
	}catch(NullPointerException e) {
		e.printStackTrace();
	}
	    }
	         }
