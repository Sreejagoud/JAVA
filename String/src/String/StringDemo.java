package String;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		s = sc.nextLine();
		String s1=s.toLowerCase();
				
		System.out.println("No of characters ="+s.length());
		
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i'||ch=='o'|| ch=='u') {
				c=c+1;
			}
		}
		System.out.println("No of Vowels="+c);

	}

}
