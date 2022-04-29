package myproject;

public class GrossaryManage {
	public class TheClassProject {
		static String charector;
		public static void content() throws FileNotFoundException, IOException, ClassNotFoundException  {
			String item;
			int qty = 0;
			double price,total = 0,pay;
			char ch=0;
			Scanner sc=new Scanner(System.in);
			Scanner sc1=new Scanner(System.in);
			ArrayList<Product1> list=new ArrayList<Product1>();
			File file=new File("Grossery.txt");
			ObjectOutputStream out=null;
			ObjectInputStream in=null;
			ListIterator<Product1> lit=null;
			do
			{
				System.out.println("***************************************************");
				System.out.println("****** WELCOME TO GROSSERY MANGAEMENT SYSTEM ******");
				System.out.println("***************************************************");
				System.out.println("1. Add");
				System.out.println("2. Display");
				System.out.println("3. Search");
				System.out.println("4. Delete");
				System.out.println("5. Order");
				System.out.println("***************************************************");
				System.out.println();
				System.out.println("***************************************************");
				System.out.println("Enter your choice ");
				char choice=sc.next().charAt(0);
				switch(choice)
				{
				case '1':if(charector.equals("user"))
						 {
							System.out.println("User can't use this option");
							System.out.println("Plz select options 1,3");
						 }	
						else
						{
						 System.out.println("Enter how many Item to be added");
		                 int n=sc.nextInt();
		                 for(int i=0;i<n;i++)
		                 {
						 System.out.println("Enter the Item name");
				         item=sc1.nextLine();
				         System.out.println("Enter the Item quantity");
				         qty=sc.nextInt();
				         System.out.println("Enter the Item price");
				         price=sc.nextDouble();
				         list.add(new Product1(item,qty, price)); 
		                 }
		                 out=new ObjectOutputStream(new FileOutputStream(file));
		                 out.writeObject(list);
		                 out.close();
				}
		                 break;
				case '2': in=new ObjectInputStream(new FileInputStream(file));
	list=(ArrayList<Product1>)in.readObject();
							 in.close();

	lit=list.listIterator();
							while(lit.hasNext())
							{
					         System.out.println(lit.next());
							}
				         break;
				case '3':boolean found=false;
						System.out.println("Enter the item to be searched");
						String item2=sc1.next();
						lit=list.listIterator();
						while(lit.hasNext())
						{
							Product1 pr=(Product1)lit.next();
							if(pr.item.equals(item2))
							{
								System.out.println(pr);
								found=true;
							}
						}
						if(found)
						{
							System.out.println(item2+" is in a list");
						}
						else
						{
							System.out.println(item2+" is not in a list");
						}
					    break;
				case '4':if(charector.equals("user"))
						{
						System.out.println("User can't use this option");
						System.out.println("Plz select options 1,3");
						}	
						else
						{
					    boolean found1=false;
				        System.out.println("Enter the item to be removed");
				        String item1=sc1.next();
				        lit=list.listIterator();
				        while(lit.hasNext())
				        {
					    Product1 pr=(Product1)lit.next();
		               if(pr.item.equals(item1))
		                {
		    	        lit.remove();
		    	        found1=true;
		                }
				        }
				        if(found1)
				        {
					      out=new ObjectOutputStream(new FileOutputStream(file));
					      out.writeObject(list);
					      out.close();
					      System.out.println(item1+" is removed sucessfully");
				        }
				        else
				        {
				          System.out.println(item1+" is not in a list");
					
				        }
						}
				        break;
				case '5':System.out.println("Enter the item to be ordered");
				         String item1=sc.next();
				         lit=list.listIterator();
				         while(lit.hasNext())
				         {
				        	 Product1 pr=(Product1)lit.next();
					         if(pr.item.equals(item1))
					         {
					        	 System.out.println("You have choosed "+item1);
					        	 System.out.print("How many "+item1+" you want to Buy? :");
					        	 int qty1=sc.nextInt();
					        	 if(pr.qty==0)
					        	 {
					        		 System.out.println("Your entered quantity of          "+item1+" is not availble...!");
					        	 }
					        	 else
					        	 {
					        	 total=total+(qty1*pr.price);
					        	 pr.qty=(pr.qty-qty1);
					        	 out=new ObjectOutputStream(new FileOutputStream(file));
							      out.writeObject(list);
							      out.close();
					        	 System.out.println("Enter a payment "); 
					        	 pay = sc.nextDouble();
								 if(pay <=total)
								 { 
									 System.out.println("Not enough payment");
									 }
								 else
								 {
								 System.out.println("Total price is " + total); 
								 total = pay-total;
								 System.out.println("The change is " + total);
								 } 
								 }
					         }
					         }
				         }
				System.out.println("Do u want to continue press y");
		          ch=sc.next().charAt(0);
			}while(ch=='y');

		}

}
