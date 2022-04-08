package pack1;

		@SuppressWarnings("serial")
		class BankBalance extends Exception{
			BankBalance(String s){
			super(s);
			}
		}
		class sbi{
			int balance = 20000;
			void deposit(int damount) {
			
			balance =balance + damount;
			System.out.println("The balance update is "+damount);
			}
		      void withdraw(int amt) {
		    	  try {
		    		if(amt>balance)  {
		    			throw new BankBalance("Insufficient Balance");
		    		}
		    		else {
		    			System.out.println("Update balance is "+amt);
		    		}
		    	  }
		    	  catch(BankBalance e) {
		    		  e. printStackTrace();
		    			  
		    		  }
		      }
		}
		public class ExceptionBank {

			public static void main(String[] args) {
				 sbi ob=new sbi();
				 ob.deposit(8000);
				 ob.withdraw(20000);
			}
		}
