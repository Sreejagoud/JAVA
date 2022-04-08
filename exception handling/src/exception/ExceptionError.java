package exception;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class ExceptionError {

		public static void main(String[] args) throws IOException   {
			//you can input from BufferedReader and InpuStreamReader
			String name="";
			int age=0;
			float sal=0.0f;
			InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(is);
		//or 
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter your name");
				
				name = br.readLine();
				System.out.println("Enter age");
				age=Integer.parseInt(br.readLine());
				System.out.println("Enter sal");
				sal=Float.parseFloat(br.readLine());
			
			System.out.println("Details of Employee");
			System.out.println("Name="+name);
			System.out.println("Age="+age);
			System.out.println("sal="+sal);

		}
		
		
	}
	//Use Scanner
	//read age
	//read name Shipra Mahato  nextLine
	//read fees
	//try to display
