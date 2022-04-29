package banking;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class Bank {
		public static void main(String args[]) 
			throws IOException
		{

			BufferedReader sc = new BufferedReader(
				new InputStreamReader(System.in));
			String name = "";
			int pass_code;
			int ac_no;
			int ch;

			while (true) {
				System.out.println(" ->|| Welcome to InBank ||<- ");
				System.out.println("1.Create Account");
				System.out.println("2.Login Account");

				try {
					System.out.print(" Enter Input:"); //user input
					ch = Integer.parseInt(sc.readLine());

					switch (ch) {
					case 1:
						try {
							System.out.print("Enter Unique UserName:");
							name = sc.readLine();
							System.out.print("Enter New Password:");
							pass_code = Integer.parseInt(
								sc.readLine());

							if (BankManagement.createAccount(name, pass_code)) {
								System.out.println("MSG : Account Created Successfully!");
							}
							else {
								System.out.println("ERR : Account Creation Failed!");
							}
						}
						catch (Exception e) {
							System.out.println(" ERR : Enter Valid Data::Insertion Failed!");
						}
						break;

					case 2:
						try {
							System.out.print("Enter UserName:");
							name = sc.readLine();
							System.out.print("Enter Password:");
							pass_code = Integer.parseInt(sc.readLine());

							if (BankManagement.loginAccount(name, pass_code)) 
							{
								System.out.println("MSG : Logout Successfully!");
							}
							else {
								System.out.println("ERR : login Failed!");
							}
						}
						catch (Exception e) {
							System.out.println(" ERR : Enter Valid Data::Login Failed!");
						}

						break;

					default:
						System.out.println("Invalid Entry!");
					}

					if (ch == 5) {
						System.out.println("Exited Successfully!  Thank You :)");
						break;
					}
				}
				catch (Exception e) {
					System.out.println("Enter Valid Entry!");
				}
			}
			sc.close();
		}
	}