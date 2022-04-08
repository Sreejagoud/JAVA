package data;

import java.util.Scanner;

class BankException extends Exception {
	public BankException (String s) {
		super(s);
	}
}
class SBIBank{
	int bankbalance;
		public SBIBank() {
			bankbalance=20000;
		}
		void withDraw(int withdrawamt) {
			try {
				if(withdrawamt>bankbalance) {
				throw new BankException("insufficition balance");
				}
				else {
					bankbalance=bankbalance-withdrawamt;
					System.out.println("Balance amount="+bankbalance);
			}
			}catch(BankException e) {
				e.printStackTrace();	
		}
	}
}
public class MainBank {

	public static void main(String[] args) {
		SBIBank sob=new SBIBank();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to be withdraw");
		int amt=sc.nextInt();
		sob.withDraw(amt);
	}

}
