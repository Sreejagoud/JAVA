package com.edu;
	import java.util.Scanner;


	public class Elavator {
	    public void helper()
	    {
	    	System.out.println("Enter which floor u want to go:");
	    	Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	    	if(n>=1 || n<=10)
	    	{
	    		for(int i=1;i<=n;i++)
	    		{
	    			if(i==1)
	    			{
	    			System.out.print("Going up..."+i);
	    			}
	    			else
	    			{
	    				System.out.print("..."+i);
	    			}
	    		}
	    		System.out.print("...Ding!");
	    	}else
	    	{
	    		System.out.println("Plz enter valid floor number....");
	    	}
	    	
	    }
	    public void selectFloor()
	    {
	    	helper();
	    }
	    public void fireAlram()
	    {
	    	System.out.println("Danger! You must exit the bulding now !");
	    }
		public static void main(String[] args) {
			boolean flag=false;
			do
			{
			System.out.println("(s)elect floor");
			System.out.println("(f)ire alram");
			System.out.println("(q)uit");
			Scanner sc=new Scanner(System.in);
			char option=sc.next().charAt(0);
			Elavator e=new Elavator();
			switch(option)
			{
			case 's':e.selectFloor();
			         break;
			case 'f':e.fireAlram();
			         break;
			case 'q':System.exit(0);
			         break;
			default:System.out.println("Invalid option....!");         
			}
			System.out.println();
			System.out.println();
			}while(flag=true);
	}

}
