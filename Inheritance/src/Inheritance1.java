
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Single inheritance
		class A{  //superclass or parent class
			  int i; //instance variable 
			  A(){   //Constructor
			       i=10;
			     System.out.println("i="+i);
			  }
			}
			class B extends A{ //class B is called child class or subclass
			  int j;
			  B(){  //constructor
			    j=23;
			}
			 void add(){
				 
			int s=i+j;
			 System.out.println("sum="+s);
			}
			}
			/*public class Inheritance1{
				  public static void main(String args[]){
				   B ob=new B();
				   ob.add();
				}
			}*/
	}
}