package mypack.com;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread ob=new Thread() {
			public void run() {
				System.out.println("Run method");
			}
		};
		ob.start();
		//or
		new Thread() {
			public void run() {
				System.out.println("Run method");
			}
			
		}.start();

	}

}
