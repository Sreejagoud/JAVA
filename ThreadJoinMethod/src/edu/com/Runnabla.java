package edu.com;


	class MyClass implements Runnable{

		@Override
		public void run() {
			
			System.out.println("Inside run method "+Thread.currentThread());
		}
	}
	public class Runnabla {
		public static void main(String[] args)throws InterruptedException {
			MyClass ob = new MyClass();
			Thread tob = new Thread(ob);
			Thread tob1 = new Thread(ob);
			tob.setName("sreeja");
			tob1.setName("sree");
			tob.start();
			tob.join();
			tob1.start();
		}

	}
