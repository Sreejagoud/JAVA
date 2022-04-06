package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class FrindSearch {
	public static void main(String[] args) {

		ArrayList<Integer> lst=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the your choice");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("enter the Names");
			Integer e=sc.nextInt();
			lst.add(e);
		}
		System.out.println("ArrayList Names="+lst);
		
		System.out.println("Enter Names to search");
		int s=sc.nextInt();
		if(lst.contains(s)) {
			System.out.println(s+" present in list");
		}else {
			System.out.println(s+" not present in list");
		}
	}
}