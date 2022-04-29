package myproject;

	import java.io.IOException;
	import java.util.Scanner;

	public class Mac extends GrossaryManage {
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			char ch1;
		    do {
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the Charector ");
			charector=sn.next();
			Mac M=new Mac();
			if(charector.equals("user"))
			{
			System.out.println("Enter the user name ");
			String uname=sn.next();
			System.out.println("Enter the Password ");
		    String Password=sn.next();
		    if(uname.equals("ashwith@gmail.com")&&Password.equals("924292"))
		    {
		      System.out.println("User Logined Sucessfully......");
		      M.content();         //Calling method content() of GrossaryManagementSystem
		    }
		    else
		    {
		    	System.out.println("Invalid Username or Password......");
		    }
			}
		    else if(charector.equals("admin"))
		    {
		    	System.out.println("Enter the user name ");
				String uname=sn.next();
				System.out.println("Enter the Password ");
			    String Password=sn.next();
			    if(uname.equals("ashwith@gamil.com")&&Password.equals("924292"))
			    {
			      System.out.println("Admin Logined Sucessfully......");
			      M.content();       //Calling method content() of GrossaryManagementSystem

			    }
			    else
			    {
			    	System.out.println("Invalid Username or Password......");
			    }
		    }
			System.out.println("Do you want to retry then press y otherwise n");
	        ch1=sn.next().charAt(0);
		    }while(ch1=='y');
		}

	
			
		}
	
	