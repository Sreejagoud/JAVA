package exception;

	class BankBalance1 extends Exception{
		BankBalance1(String s){
			super(s);
		}
	}

	class SBI{
		int balance;
		void deposit(int damt) {
			balance=balance+damt;
			System.out.println("Your Bank Balance="+balance);
		}
		
		void withdraw(int wamt) {
			try {
			if(wamt>balance) {
				throw new BankBalance1("Insufficient balance");
			}
			else {
				balance=balance-wamt;
				System.out.println("Remaining Balance "+balance);
			}
			}catch(BankBalance1 e) {
				e.printStackTrace();
			}
			
			
		}
	}

	public class MainBankApp {
		public static void main(String[] args) {
			SBI ob=new SBI();
			ob.deposit(1000);
			ob.withdraw(600);
		}
	}
