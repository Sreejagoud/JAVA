package edu.com;

	//static can be applied to variable ,method, and inner class, static block
	//program to demonstrate static variable
	//static data is shared by all the objects

	class DemoStatic{
		static int i; //variable as static->shared all objects
		int j; 
		DemoStatic(){
			i=1;
			j=1;
			System.out.println("static initial value of i="+i);
			System.out.println("non static initial value of j="+j);
		}
		void display() {  //non static method can access static as well non static data
			i=i+1; //static
			j=j+1;  //non static
			System.out.println("static i="+i);  //i=i+1=2  //i=2+1=3
			System.out.println("non static j="+j); //j=j+1=2  
		}
	}
	public class StaticVariable {

		public static void main(String[] args) {
			System.out.println("Main");
			DemoStatic ob=new DemoStatic();
			DemoStatic ob1=new DemoStatic();
			ob.display();
			ob1.display();
		}

	}
