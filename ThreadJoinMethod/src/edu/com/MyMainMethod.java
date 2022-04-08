package edu.com;
//class MyThreadClass extends Thread{
	//public void run() {
		//System.out.println("Thread run Method"+Thread.currentThread());
//	}
//}

//public class MyMainMethod {

	//public static void main(String[] args) {
		
		//MyThreadClass ob=new MyThreadClass();
			//MyThreadClass ob1=new MyThreadClass(); 
			//System.out.println("main class");
			//ob.setName("First");
			//ob1.setName("Second");
			
			//ob.start();
			
			//ob.join();
			
			//ob1.start();
	//	}

	//}
class MyThreadClass extends Thread{
	 public void run() {
		 for(int i=1;i<=5;i++) {
		 System.out.println("Thread run method "+Thread.currentThread());
		 }
	 }
}

public class MyMainMethod  {

	public static void main(String[] args) throws InterruptedException {
		MyThreadClass ob=new MyThreadClass();
		MyThreadClass ob1=new MyThreadClass();
		System.out.println("main class");
		ob.setName("First");
		ob1.setName("Second");
		
		ob.start();
		System.out.println(ob.isAlive());
			ob.join();//checked exception
			System.out.println(ob.isAlive());
		ob1.start();
	}
}