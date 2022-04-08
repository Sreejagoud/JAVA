package mypack.com;

	class Table{
		void print(int num) {
			for(int i=1;i<=100;i++) {
			System.out.println(num+"x"+i+"="+num*i);  //5x1=5
			}
		}
	}

	class FirstThread extends Thread{
		Table t;
		FirstThread(Table t){
			this.t=t;
		}
		public void run() {
			t.print(5);
		}
	}

	class SecondThread extends Thread{
		Table t;
		
		public SecondThread(Table t) {
			this.t=t;
		}

		public void run() {
			t.print(20);
		}
	}

	public class MyApp {

		public static void main(String[] args) {
			Table t=new Table();
			FirstThread ob=new FirstThread(t);
			
	        SecondThread ob1=new SecondThread(t);
	        ob.start(); //calls run method of firstthread
	        ob1.start();
		}

	}