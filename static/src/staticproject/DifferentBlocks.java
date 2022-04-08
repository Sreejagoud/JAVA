package staticproject;

//public class DifferentBlocks{

	//static {
		//System.out.println("Static will execute before main");
	//}
	//{
		//System.out.println("Normal Block before constructor on object creation");
	//}
	//DifferentBlocks(){
		//System.out.println("On object creation constructor will execute");
	//}
	//void display() {
		//System.out.println("Display method");
	//}
	//public static void main (String args[]) {
		//System.out.println("Main method");
		//DifferentBlocks ob=new DifferentBlocks();
		//ob.display();
		
	//}
//}
public class DifferentBlocks{

	static{
		System.out.println("Static will execute before main");
	}
	{
		System.out.println("Normal Block before constructor on object Creation");
	}
	
	DifferentBlocks(){
		System.out.println("On object creation constructor will executes");
	}
	void display() {
		System.out.println("Display method");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		
		DifferentBlocks ob=new DifferentBlocks();
		ob.display();

	}

}
