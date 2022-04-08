package mypack.com;

	class Calculate{
		 synchronized void print(int num) {
			for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+num*i);  //5x1=5
			}
		}
	}

	class FirstTableThread extends Thread{
		Table t;
		FirstTableThread(Table t){
			this.t=t;
		}
		public void run() {
			t.print(5);
		}
	}

	class SecondTableThread extends Thread{
		Table t;
		
		public SecondTableThread(Table t) {
			this.t=t;
		}

		public void run() {
			t.print(20);
		}
	}
	public class Synchronized {

		public static void main(String[] args) {
			Table t=new Table();
			FirstThread ob=new FirstThread(t);
			
	        SecondThread ob1=new SecondThread(t);
	        ob.start(); //calls run method of firstthread
	        
	        ob1.start();
		}
	}