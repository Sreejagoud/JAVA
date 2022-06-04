package example;

import java.util.Scanner;

public class Vowels {
	    public static void main(String[] args) {

	        // String str = "COMPUTER APPLICATIONS";// string or word
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Name of 3 or more words");
	        String str = sc.nextLine();

	        // remove vowels

	        String newStr = " ";

	        for (int i = 0; i < str.length(); i++) {

	            char ch = Character.toLowerCase(str.charAt(i));
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                continue;
	            }
	            newStr = newStr + ch;
	        }
	        System.out.println("String or word after vowels removed = " + newStr);
	    }

	}
