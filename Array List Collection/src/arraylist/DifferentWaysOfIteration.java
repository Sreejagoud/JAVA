package arraylist;

	//Different ways of iterating ArrayList
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.ListIterator;
	import java.util.Scanner;

	public class DifferentWaysOfIteration {

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
			System.out.println("Using list object "+l);
			System.out.println("Using for loop");
			for(int i=0;i<l.size();i++) {
				System.out.println(l.get(i));
			}
			
			//using enhanced for or loop for Each
			//Syntax
			//for(datatype var:ArrayListname)
			System.out.println("Using enhanced for loop");
			for(Integer i:l) {
				System.out.println(i);
			}
			
			//using Iterator
			System.out.println("Iterating elements using Iterator interface");
			Iterator it=l.iterator(); //Only forward direction
			while(it.hasNext()) { 
				System.out.println(it.next());
			}
			
			//ListIterator : use for both forward and backward direction
			System.out.println("Using ListIterator");
			ListIterator lit=l.listIterator();
			while(lit.hasNext()) {
				System.out.println(lit.next());
			}
			System.out.println("Print list in reverse order");
			while(lit.hasPrevious()) {
				System.out.println(lit.previous());
			}
		}

}
