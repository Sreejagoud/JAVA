package array;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentance");
		s = sc.nextLine();
		String s1=s.toLowerCase();		
		System.out.println("No of characters ="+s.length());
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch==' ')  {
				c=c+1;
			}
		}
		System.out.println("No of words="+(c+1));
	}
}