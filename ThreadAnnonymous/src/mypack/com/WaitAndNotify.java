package mypack.com;

	//wait and notify method will work only in synchronized block

	class MyClass1 extends Thread{
		int total;
		public void run() {
			synchronized (this) { //this is present object
			for(int i=1;i<=50;i++) {
				total=total+i;
			}
			notify();
		}
	}
	}
	public class WaitAndNotify {

		public static void main(String[] args) throws InterruptedException {
			MyClass1 ob=new MyClass1();
			ob.start();
			synchronized (ob) {
			System.out.println("Before wait");
			ob.wait();
			System.out.println("sum of 1 to 50 natural numbers="+ob.total);
			}
		}
	}