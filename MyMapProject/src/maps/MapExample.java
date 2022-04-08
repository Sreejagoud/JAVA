package maps;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>map=new HashMap<Integer, String>();
		map.put(16, "Sreeja");
		map.put(12, "Siri");
		map.put(76, "Swetha");//Duplicate key is not added( hp.put(76, "Swetha");)
		System.out.println("HashMap"+map);
		//Traverse
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey() +" "+ m.getValue());

	}
	}
}
