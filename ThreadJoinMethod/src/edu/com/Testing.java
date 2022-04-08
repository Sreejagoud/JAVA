package edu.com;
	import edu.com.MyThreadClass1;
	class MyThreadClass1 extends Thread{
		public void run() {
			for (int i=0;i<=10;i++) {
				System.out.println("Inside run method"+Thread.currentThread());
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException s) {
					s.printStackTrace();
				}}}}
	public class Testing {
		public static void main(String[] args)  throws InterruptedException {
			// TODO Auto-generated method stub
			MyThreadClass1 ob=new MyThreadClass1();
			MyThreadClass1 ob1=new MyThreadClass1();
			ob.setName("First");
			ob1.setName("Second");
			
			ob.start();
			ob.join();
			ob1.start();
		}
		}