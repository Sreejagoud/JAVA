package String;

	public class  Sum{
		int i,j,s;
	  Sum(){ //Constructor with no arg
			System.out.println("Constructor is a special type of function");
			System.out.println("No return type");
			System.out.println("Calls automatically on object creation");
			System.out.println("Name of the constructor should be the name of the class");
			i=2;
			j=8;
		}
	     Sum(int k, int l){
			i=k;
			j=l;
			
		}
		void add() {
			
			s=i+j;
		}
		
		void disp() {
			System.out.println("Display ");
			System.out.println("The sum of "+i+" and "+j+" is "+s);
		}
	}
	public class AdditionString {

		private String i;
		private String j;

	public static void main(String[] args)   {
		//non parametrized constructor
		AdditionString ob=new AdditionString(); //calls constructor
          System.out.println("i="+ob.i);
          System.out.println("j="+ob.j);
          ob.add();
          ob.disp();
          //parameterized constructor
          AdditionString ob1=new AdditionString(); 
          System.out.println("i="+ob1.i);
          System.out.println("j="+ob1.j);
          ob1.add();
          ob1.disp();
      }

	private void disp() {
		// TODO Auto-generated method stub
		
	}

	private void add() {
		// TODO Auto-generated method stub
		
	}
           }
