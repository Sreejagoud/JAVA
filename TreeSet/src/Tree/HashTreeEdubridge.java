package Tree;

import java.util.HashSet;

		import java.util.HashMap;
		import java.util.Map;

		public class HashTreeEdubridge {

			public static void main(String[] args) {
				HashMap<Integer, String> hob=new HashMap<Integer, String>();
				hob.put(1, "Kavitha");
				hob.put(2, "Kiran");
				hob.put(4, "Abhinaya");
				hob.put(5, "Abhinaya");
				hob.put(3, "Ramesh");
				System.out.println(hob);
				
				System.out.println("");
		        for(Map.Entry<Integer, String> m:hob.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue()); 

			}
		}
		}	
	
/*public class HashTreeEdubridge {

	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<String>();
		hs.add('E');
		
		//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
		System.out.println(hs);
		*/
