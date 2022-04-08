//program on HashMap,LinkedHashMap,TreeMap,Hashtable
package maps;

		import java.util.HashMap;
        import java.util.Hashtable;
        import java.util.LinkedHashMap;
        import java.util.Map;
        import java.util.TreeMap;

		public class MyMapsAll {

			public static void main(String[] args) {
				HashMap<Integer, String>hp=new HashMap<Integer, String>();
				hp.put(16, "Sreeja");
				hp.put(12, "Siri");
				hp.put(76, "Swetha");//Duplicate key is not added( hp.put(76, "Swetha");)
				System.out.println("HashMap"+hp);
				//Traverse
				hp.putIfAbsent(79, "Swetha");
				for(Map.Entry m1:hp.entrySet()){
					System.out.println(m1.getKey() +" "+ m1.getValue());
				}
				
				LinkedHashMap<Integer, String>hm1=new LinkedHashMap<Integer, String>();
				hm1.put(18, "Sreeja");
				hm1.put(32, "Siri");
				hm1.put(46, "Swetha");
				System.out.println("LinkedHashMap"+hm1);
				
				for(Map.Entry m:hm1.entrySet()){
					System.out.println(m.getKey() +" "+ m.getValue());
				
				TreeMap<Integer, String>hm2=new TreeMap<Integer, String>();
				hm2.put(88, "Sreeja");
				hm2.put(17, "Siri");
				hm2.put(78, "Swetha");
				System.out.println("TreeMap"+hm2);
				
				for(Map.Entry m2:hm2.entrySet()){
					System.out.println(m2.getKey() +" "+ m2.getValue());
				
				Hashtable<Integer, String>tb=new Hashtable<Integer, String>();
				tb.put(78, "Sreeja");
				tb.put(49, "Siri");
				tb.put(46, "Swetha");
				System.out.println(tb);
				
				for(Map.Entry m3:tb.entrySet()){
					System.out.println(m3.getKey() +" "+ m3.getValue());
				}
				}
				}
		}	
			}
