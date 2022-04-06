package array;

import java.util.Scanner;

public class TwoDiamentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][];
		int n,m;
				
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		m=sc.nextInt();
		System.out.println("Enter number of colms");
		n=sc.nextInt();
		
		b=new int[m][n];
		System.out.println("Enter "+m+"X"+n+" matrix");
		for(int r=0;r<m;r++) {
			for(int c=0;c<n;c++) {
				b[r][c] = sc.nextInt();
			}
		}
		
		System.out.println("Entered Matrix is");
		for(int r=0;r<m;r++) {
			for(int c=0;c<n;c++) {
				System.out.print(b[r][c] +" ");
			}
			
			System.out.println();
		}
	}

}
