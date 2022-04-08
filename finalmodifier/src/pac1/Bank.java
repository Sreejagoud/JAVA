package pac1;

public class Bank {
	final class MyBank{
		final int accno=87654;
		 final void modify() {
			//accno=accno+6; //error
			 System.out.println("Modify");
		}
	}

	//public class MyClassFinalDemo extends MyBank{//Final class cannot be suclassed
		//void modify() {//Error final method cannot be overroden
			//System.out.println("Override Modify");
		//}

	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}
