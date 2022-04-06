package array;

import java.util.Scanner;

public class WordCountRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s=" ",rev=" ";
		
		int c = 0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		s = sc.nextLine();
		
		for(i=s.length()-1; i>=0; i--) {
			char ch =  s.charAt(i);
			rev = rev + ch;		
		}
		System.out.println("Reversed string is " +rev);
	}

}
