package pack2;

	class Mythread extends Thread{
		//override the run method
		public void run() {
			for(int i=1;i<=100;i++) {
				System.out.println("Inside run Method "+Thread.currentThread());
		   try {
			   Thread.sleep(10000);
		   }catch(InterruptedException e) {
			   e.printStackTrace();
		   }}
		}
		public class SleepMethod {
		public static void main(String[] args) {
			Mythread ob=new Mythread(); //new state
			Mythread ob1=new Mythread(); 	//new state
			System.out.println("Main JVM Thread "+Thread.currentThread());
			System.out.println("Thread-0 "+ob.isAlive());//state of thread
			System.out.println("Thread-1 "+ob1.isAlive());
			ob.setName("first");
			ob1.setName("second");
			ob.start(); //Runnable state
			ob1.start(); //Runnable state
		}
}
        }
