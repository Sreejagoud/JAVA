package arraylist;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.Scanner;

	public class IterateArrayList {

		public static void main(String[] args) {
			int e;
			Scanner sc=new Scanner(System.in);
			ArrayList<Integer> l=new ArrayList<Integer>();
			System.out.println("How many elements you want");
			int n=sc.nextInt();
			
			System.out.println("Enter "+n+" elements into arraylist");
			for(int i=1;i<=n;i++) {
				e=sc.nextInt();
				l.add(e);
			}
			
			System.out.println("Using list "+l);
			//using enhanced for or loop for Each
			//for(datatype var:ArrayListname)
			for(Integer i:l) {
				System.out.println(i);
			}
			
			//using Iterator
			System.out.println("Iterating elements using Iterator interface");
			Iterator it=l.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		}
	}