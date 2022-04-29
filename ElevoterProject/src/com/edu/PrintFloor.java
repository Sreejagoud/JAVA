package com.edu;

	import java.util.Scanner;

	public class PrintFloor {
		

		public static void main(String[] args) {
			int j=1;
			boolean f=false;
			do
			{
				System.out.println("Enter the floor u want to go:");
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int i;
				if(n>j)
				{
					if(n>=1||n<=10)
					{
						for(i=j;i<=n;i++)
						{
							if(i==j)
							{
								System.out.println("Going up..."+i);
								f=true;
							}else
							{
								System.out.println("..."+i);
								f=true;
							}
						}System.out.println("...Ding!");
						j=i-1;
					}else
					{
						System.out.println("Enter valid floor number..");
					}
				}
				else
				{
					if(n>=1||n<=10)
					{
						for(i=j;i>=n;i--)
						{
							if(i==j)
							{
								System.out.println("Going Down...."+i);
								f=true;
							}else
							{
								System.out.println("...."+i);
								f=true; 
							}
						}System.out.println("...Ding");
						j=i+1;
					}else
					{
						System.out.println("Enter valid floor number..");
					}
				}
				System.out.println();
				System.out.println();
			}while(f=true);

		}
}
