package maps;

import java.util.HashMap;
import java.util.Map;

public class MapRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>hp=new HashMap<Integer, String>();
		hp.put(16, "Sreeja");
		hp.put(12, "Siri");
		hp.put(76, "Swetha");//Duplicate key is not added( hp.put(76, "Swetha");)
		System.out.println(" list of elements: "+hp);
		hp.remove(76);

	}

}
