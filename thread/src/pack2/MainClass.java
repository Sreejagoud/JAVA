package pack2;


	class MyClass  extends Thread{
		//override the run method
		public void run() {
				System.out.println("Inside run Method "+Thread.currentThread());
		}
	}
	public class MainClass {

		public static void main(String[] args) {
			MyClass ob=new MyClass(); //new state
			MyClass ob1=new MyClass(); 	//new state
			System.out.println("Main JVM Thread "+Thread.currentThread());
			System.out.println("Thread-0 "+ob.isAlive());
			System.out.println("Thread-1 "+ob1.isAlive());
			ob.start(); //Runnable state
			ob1.start(); //Runnable state
			System.out.println("Thread-0 "+ob.isAlive());
			System.out.println("Thread-1 "+ob1.isAlive());
		}
}
