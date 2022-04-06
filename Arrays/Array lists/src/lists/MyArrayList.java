package lists;

	import java.util.ArrayList;

	public class MyArrayList {

		public static void main(String[] args) {
			ArrayList<String> list=new ArrayList<String>();
			list.add("hello");
			list.add("hi");
			list.add("rani");
	        list.add("kiran");
	        list.add("swetha");
	        list.add("ravi");
	        
	        list.add(2,"Tharani");//specified index
	        System.out.println("get value in 3rd index "+list.get(2));
	        
			System.out.println(list);//displaying list
			
			ArrayList<Integer> iob=new ArrayList<Integer>();
			
			iob.add(44);
			iob.add(45);
			iob.add(64);
			iob.add(23);
			iob.add(43);
			
			 iob.add(2,34);//specified index
		        System.out.println("get value in 3rd index "+iob.get(2));
		        
				System.out.println(iob);
			ArrayList<Float> fob=new ArrayList<Float>();
			
			fob.add(4.5f);
			fob.add(34.0f);
			fob.add(4.9f);
			fob.add(3.5f);
			fob.add(5.8f);
			 fob.add(3,4.8f);//specified index
		        System.out.println("get value in 3rd index "+fob.get(2));
		        
				System.out.println(fob);
		}
	}