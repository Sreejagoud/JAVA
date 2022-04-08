package data;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.Scanner;

	public class BufferReader {

		public static void main(String[] args)throws IOException {
			String name;
			int age;
			float sal;
			
		//Create an object
			//InputStreamReader is=new InputStreamReader(System.in);
			//BufferedReader br=new BufferedReader(is);
			
			
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			//readLine()->String
			//int age=Integer.parseInt(br.readLine());   //"23"
			//float sal=Float.parseFloat(br.readLine());
			//long l=Long.parseLong(br.readLine())
			//short s=Short.parseShort(br.readLine());
			//char ch=br.readLine().charAt(0);
			System.out.println("Enter age");
			age=Integer.parseInt(br.readLine());
			System.out.println("Enter name");
			name=br.readLine();
			System.out.println("Enter salary");
			sal=Float.parseFloat(br.readLine());
	//Display
			System.out.println("Name="+name);
			System.out.println("Age="+age);
			System.out.println("Salary="+sal);
			
			
		}

}
