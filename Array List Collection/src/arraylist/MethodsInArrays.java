package arraylist;

import java.util.ArrayList;

public class MethodsInArrays {

	public static void main (String args[]) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(24);
		al.add(2, 36);
		//al.remove(1);
		//al.clear();
		System.out.println(al);
		System.out.println(al.contains(12));
		ArrayList<String> bl=new ArrayList<>();
		bl.add("a");
		bl.add(1, "b");
		bl.add(2, "c");
        //bl.clear();
		System.out.println(bl);
		ArrayList<Integer> a2=new ArrayList<>();
		a2.add(34);
		a2.add(67);
		a2.add(2, 36);
		al.addAll(a2);
		System.out.println(al);
		al.addAll(1,a2);
		System.out.println(al);
	}
	}