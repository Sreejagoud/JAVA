package exception2;

	import java.util.Scanner;

	class BankBalanceCheck1 extends Exception{
		BankBalanceCheck1(String s){
			super(s);
		}
	}
	class SBI{
		int balance;
		SBI(){
			balance=10000;
		}
		void deposit(int damt) {
			balance=balance+damt;
			System.out.println("Your Bank Balance="+balance);
		}
		
		void withdraw(int wamt) {
			try {
			if(wamt>balance) {
				throw new BankBalanceCheck1("Insufficient balance");
			}
			else {
				balance=balance-wamt;
				System.out.println("Remaining Balance "+balance);
			}
			}catch(BankBalanceCheck1 e) {
				e.printStackTrace();
			}
		}
		public void chkBalance() {
			System.out.println("Your Balance amount="+balance);
			
		}
	}
	public class BankBalanceCheck {
		public static void main(String[] args) {
			SBI ob=new SBI();
	Scanner sc = null;
	int ch=sc.nextInt();
				int amt;
				switch(ch) {
				case 1:System.out.println("Enter amount to deposit");
				       amt=sc.nextInt(); 
				       ob.deposit(amt); //function calling with arg
				       break;
				case 2:System.out.println("Enter amount to withdraw");
			       amt=sc.nextInt(); 
			       ob.withdraw(amt); //function calling with arg
			       break;
				case 3:ob.chkBalance();
				     break;
				case 4:System.exit(0);
				}
		}
	}
	