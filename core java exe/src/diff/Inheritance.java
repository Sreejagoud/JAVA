package diff;

	//What is a interface: blue print of class
	//interface is used to achieve multiple inheritance
	//one class can implement multiple interface
	//ex : class A implements B,C,d
	//class can extend only one class and implement any number of interface
	//one interface can extend any number of interfaces
	interface myint{
		int i=9;    //public static final int i=9;
		void m1();   //abstract public void m1();
	}
	class MyClass implements myint{

		@Override
		public void m1() {
			System.out.println("m1 method of interface");
		}
		}
	
	public class Inheritance {

		public static void main(String[] args) {
			MyClass ob=new MyClass();
	          ob.m1();
		}
	
	}
	