package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class school {
	int sid; 
	  String name;
	  float amount;

	  void input() throws IOException {
		  InputStreamReader is=new InputStreamReader(System.in);
		  BufferedReader br=new BufferedReader(is);
		  //readLine()->String     read()->Ascii value
		  System.out.println("Enter School id");
		  sid=Integer.parseInt(br.readLine());   // "23"
		  System.out.println("School name");
		   name=br.readLine();
		  System.out.println("Total schoo fees");
		  amount = Float.parseFloat(br.readLine());
	  }

	  void display() {
		  
		  System.out.println("School id="+sid);
		  System.out.println("School name="+name);
		  System.out.println("Total Fees collected "+amount);
	  }
	  }


