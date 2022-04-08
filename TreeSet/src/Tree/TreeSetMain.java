package Tree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>tob=new TreeSet<Integer>();
		tob.add(34);
		tob.add(67);
		tob.add(54);
		tob.add(38);
		System.out.println(tob);
		
		System.out.println("Ascending order");
		Iterator<Integer> it=tob.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Descending order");
		Iterator<Integer> it1=tob.descendingIterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		TreeSet<String> tob1=new TreeSet<String>();
		tob1.add("Zeeba");
		tob1.add("Anil");
		tob1.add("Kiran");
		tob1.add("John");
		System.out.println(tob1);
		
		//Individual elements to be displayed
		//Ascending
		System.out.println("Ascending order");
		Iterator<String> ot=tob1.iterator();
		while(ot.hasNext()) {
			System.out.println(ot.next());
		}
		//Descending order
		System.out.println("Descending order");
		Iterator<String> ot1=tob1.descendingIterator();
		while(ot1.hasNext()) {
			System.out.println(ot1.next());
		}
	}
}
