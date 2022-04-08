package maps;

import java.util.HashMap;
import java.util.Map;

public class IfAbsentFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>hp=new HashMap<Integer, String>();
		hp.put(16, "Sreeja");
		hp.put(12, "Siri");
		hp.put(76, "Swetha"); //Duplicate key is not added( hp.put(76, "Swetha");)
		
		System.out.println("HashMap"+hp);
		//Traverse
		hp.putIfAbsent(56, "Swetha");
		for(Map.Entry m1:hp.entrySet()){
			System.out.println(m1.getKey() +" "+ m1.getValue());
		}

	}

}
