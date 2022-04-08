package exception;

public class ArrayError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=0, c=0;
		int ar[]=new int[4];
		System.out.println("Before exception");
		try {
			System.out.println("Inside try");
			c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
			e.printStackTrace();
		}
		/*try {
			ar[6]=8;	
		}
		catch(ArrayIndexOutOFBoundery);
		System.out.println("After Exception");
		e.printStackTrace();
	}finally {
		System.out.println("Finally Block");*/
	}
}
