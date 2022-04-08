package String;

import java.util.Scanner;

public class WordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s;
		int c=0;
		System.out.println("Enter a sentenance");
		s=sc.nextLine();
		String ch[]=s.split(" ");
		System.out.println("Enter a word to search");
		String w=sc.next();
		for(int i=0;i<ch.length;i++) {
			if(ch[i].equals(w)) {
				c++;
			}
		}
		System.out.println("Occurance of word"+c);

	}

}
