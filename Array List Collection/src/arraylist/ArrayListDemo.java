package arraylist;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.Iterator;
	import java.util.TreeSet;

	class Student1{
	 int sid;
	 int smarks;
	 String name;
	public Student1(int sid, int smarks, String name) {
		super();
		this.sid = sid;
		this.smarks = smarks;
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	}
	class Student1MarksCompare implements Comparator<Student1> 
	{
		@Override
		public int compare(Student1 o1, Student1 o2) {
			//return 01.getName().compareTo(02.getname());
			return o1.smarks-o2.smarks;

	}
	}
		class Student1idCompare implements Comparator<Student1> {

			@Override
			public int compare(Student1 o1, Student1 o2) {
				// TODO Auto-generated method stub
				return o1.sid-o2.sid;
			} 

		}
		class Student1name implements Comparator<Student1> {

			@Override
			public int compare(Student1 o1, Student1 o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
			
		}
	public class ArrayListDemo {
		
		public static void main(String[] args) {
		
			ArrayList<Student1> ob=new ArrayList<Student1>();
			Student1 sob=new Student1(1,123,"pallu");
			Student1 sob1=new Student1(2,124,"pavi");
			Student1 sob2=new Student1(3,125,"madhu");
			ob.add(sob);
			ob.add(sob1);
			ob.add(sob2);
			System.out.println("before sort");
			Iterator<Student1> iob=ob.iterator();
			while(iob.hasNext())
			{
				Student1 bo=iob.next();
				System.out.println("sid ="+bo.getSid()+" "+"smarks="+bo.getSmarks()+" "+"sname="+bo.getName());
			}
	Collections.sort(ob,new Student1idCompare());
	System.out.println("after sorting");
	       Iterator<Student1> iob1=ob.iterator();
	       while(iob1.hasNext()){
				Student1 bo1=iob1.next();
				System.out.println("sid ="+bo1.getSid()+" "+"smarks="+bo1.getSmarks()+" "+"sname="+bo1.getName());


	       }
	       Collections.sort(ob,new Student1MarksCompare());
	        System.out.println("Sorting based Marks");
	       Iterator<Student1> iob2=ob.iterator();
	       while(iob2.hasNext()){
				Student1 bo1=iob2.next();
				System.out.println("sid ="+bo1.getSid()+" "+"smarks="+bo1.getSmarks()+" "+"sname="+bo1.getName());
		}
	       Collections.sort(ob,new Student1name());
	       System.out.println("Sorting based name");

	       Iterator<Student1> iob3=ob.iterator();
	       while(iob3.hasNext()){
				Student1 bo1=iob3.next();
				System.out.println("sid ="+bo1.getSid()+" "+"smarks="+bo1.getSmarks()+" "+"sname="+bo1.getName());
	       }
	}
}
