package interfaceex;

interface MyInterface{  //interface object cannot be created
	//variables  ;  //variables in the interface static final
	int i=20;  //static final int i=10;
	 //method declaration
	void add(); //abstract public void add();
	}

	class MyClass implements MyInterface{
	  public void add(){
	    //i=i+4; //error interface variables are final by default
	   System.out.println("Interface method addition implemented "+i);
	  }
	}

	public class InterfaceDemo{
	public static void main(String args[]){
	   MyClass ob=new MyClass();
	   ob.add();
	}
	}

	