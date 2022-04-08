package exception;

public class MainClass {
	public static void main(String[] args) {
		int a=10,b=0,c=0;
		int ar[]=new int[3];
		
		System.out.println("Before divison");
		
		try {
			c=a/b;
			ar[3]=89;
		}
		catch(ArithmeticException ex) {
			ex.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("after array assignment");
}

}
