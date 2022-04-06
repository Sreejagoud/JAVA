package arraylist;

import java.util.Scanner;

public class ArrayError {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elments");
		for(int i=0;i<=a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are");
		for(int i=0;i<=a.length;i++) {
		try {
			System.out.println(a[i]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("Statement after for loop");
		
		}
	}

}
